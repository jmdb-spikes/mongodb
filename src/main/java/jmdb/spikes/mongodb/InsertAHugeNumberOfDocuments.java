package jmdb.spikes.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static jmdb.spikes.mongodb.DataGenerator.nextContact;
import static jmdb.spikes.mongodb.MongoDatabase.connectToDB;
import static jmdb.spikes.mongodb.MongoDatabase.tryToClose;

public class InsertAHugeNumberOfDocuments implements Command {

    private static final Logger log = LoggerFactory.getLogger(InsertAHugeNumberOfDocuments.class);

    private static int LOGGING_INTERVAL = 10;
    private static String COLLECTION_NAME = "Addresses";

    public void execute() {
        DB db = connectToDB();

        try {

            DBCollection collection = db.getCollection(COLLECTION_NAME);
            log.info("dropping [%s] ...", COLLECTION_NAME);
            collection.drop();
            log.info("complete.");

            collection = db.getCollection(COLLECTION_NAME);

            log.info("starting insert ...");
            for (int i = 0; i < 1000; ++i) {
                BasicDBObject document = new BasicDBObject();
                document.putAll(nextContact());
                if (i % LOGGING_INTERVAL == 0) {
                    log.info("Count = i");
                }
                collection.save(document);
            }
            log.info("complete.");

        } catch (MongoException e) {
            throw new RuntimeException(e);
        } finally {
            tryToClose(db.getMongo());
        }
    }


}