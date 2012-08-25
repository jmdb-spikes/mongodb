package jmdb.spikes.mongodb;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.exit;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    private static final Format THREE_DP = new DecimalFormat("0.000");

    private static final Map<String, Command> COMMAND_MAP = new HashMap<String, Command>() {{
        put("insert", new InsertAHugeNumberOfDocuments());
        put("help", new HelpCommand());
    }};

    private Application() {
    }

    public static void main(String[] args) {

        new Application().run(args[0]);

    }

    public void run(String commandName) {
        log.info("Hello, I'm gonna do some mongo shit...");
        if (!COMMAND_MAP.containsKey(commandName)) {
            log.error("Oops, that command ({}) doesn't exist!", commandName);
            exit(-1);
        }

        Command command = COMMAND_MAP.get(commandName);

        long timeStarted = currentTimeMillis();

        command.execute();

        long timeTaken = currentTimeMillis() - timeStarted;

        log.info("Command completed in {} seconds.", THREE_DP.format((double) timeTaken / 1000));
    }
}
