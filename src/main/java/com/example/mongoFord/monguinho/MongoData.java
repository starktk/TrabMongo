package com.example.mongoFord.monguinho;

import com.example.mongoFord.documento.document;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.stereotype.Component;


@Component
public class MongoData implements mongo{


    private String uri = "mongodb+srv://stark:raulsurf@mybank.bjo6ncv.mongodb.net/?retryWrites=true&w=majority";

    private ObjectMapper objectMapper;
    @Override
    public MongoClient getConection() {
        return new MongoClient(uri);
    }

    @Override
    public MongoDatabase getDatabase(String database) {
        return getConection().getDatabase(database);
    }

    @Override
    public MongoCollection<Document> getCollection(String collection) {
        return getDatabase("Carros").getCollection(collection);
    }

    public document createDoc(document document) {
        getCollection("Ford").insertOne(new Document().append("Modelo", document.getModelo())
                .append("Ano", document.getAno())
                .append("valor", document.getValor()));
        return document;
    }
}
