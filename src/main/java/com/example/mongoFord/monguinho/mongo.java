package com.example.mongoFord.monguinho;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.stereotype.Repository;

@Repository
public interface mongo {

    MongoClient getConection();

    MongoDatabase getDatabase(String database);

    MongoCollection<Document> getCollection(String collection);
}
