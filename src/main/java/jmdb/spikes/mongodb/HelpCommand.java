package jmdb.spikes.mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelpCommand implements Command {
    private static final Logger log = LoggerFactory.getLogger(HelpCommand.class);

    public void execute() {
        log.info("This is the mongo application which can insert loads of mongo data!");
    }
}