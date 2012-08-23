package jmdb.spikes.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.WriteResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static jmdb.spikes.mongodb.DataGenerator.nextContact;
import static jmdb.spikes.mongodb.MongoDatabase.connectToDB;
import static jmdb.spikes.mongodb.MongoDatabase.tryToClose;

public class InsertAHugeNumberOfDocuments implements Command {

    private static final Logger log = LoggerFactory.getLogger(InsertAHugeNumberOfDocuments.class);

    private static final int BATCH_SIZE = 5000;
    private static final int TOTAL_TO_INSERT = 10000000;

    private static final String COLLECTION_NAME = "AddressList";

    public void execute() {
        DB db = connectToDB();

        try {

            DBCollection collection = db.getCollection(COLLECTION_NAME);
            log.info("Count = {}", collection.count());
            if (collection.count() > 0) {
                log.info("dropping [{}] ...", COLLECTION_NAME);
                collection.drop();
                log.info("complete.");
            }

            log.info("starting insert ...");

            int batches = TOTAL_TO_INSERT / BATCH_SIZE;
            for (int iBatch = 0; iBatch < batches; ++iBatch) {
                List<DBObject> batch = generateBatch(BATCH_SIZE);
                WriteResult writeResult = collection.insert(batch);

                if (writeResult.getError() != null) {
                    log.error(writeResult.getError());
                }

                log.info("Count = {}", collection.count());
            }

            log.info("complete.");

        } catch (MongoException e) {
            throw new RuntimeException(e);
        } finally {
            tryToClose(db.getMongo());
        }
    }

    private List<DBObject> generateBatch(int count) {
        List<DBObject> batch = new ArrayList<DBObject>();
        for (int i = 0; i < count; ++i) {
            BasicDBObject document = new BasicDBObject();
            document.putAll(nextContact());
            batch.add(document);
        }
        return batch;
    }


}