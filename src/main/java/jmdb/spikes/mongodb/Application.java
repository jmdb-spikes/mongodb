package jmdb.spikes.mongodb;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    private static final Map<String, Command> COMMAND_MAP = new HashMap<String, Command>() {{
        put("insert", new InsertAHugeNumberOfDocuments());
    }};



    public static void main(String[] args) {
        log.info("Hello, I'm gonna do some mongo shit...");

        String commandName = args[0];

        if (COMMAND_MAP.containsKey(commandName)) {
            log.error("Oops, that command doesn't exist!");
            exit(-1);
        }

        Command command = COMMAND_MAP.get(commandName);

        command.execute();

    }
}