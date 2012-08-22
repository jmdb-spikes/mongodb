package jmdb.spikes.mongodb;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;

public class MongoDatabase {

    private static final Logger log = LoggerFactory.getLogger(MongoDatabase.class);

    public static DB connectToDB() {
        try {
            Mongo mongo = new com.mongodb.Mongo("localhost", 27017);
            return mongo.getDB("MONGO-SPIKE");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (MongoException e) {
            throw new RuntimeException(e);
        }

    }

    public static void tryToClose(Mongo mongo) {
        if (mongo != null) {
            mongo.close();
        }
    }

}