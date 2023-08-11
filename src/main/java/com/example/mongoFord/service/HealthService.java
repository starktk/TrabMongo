package com.example.mongoFord.service;

import com.example.mongoFord.documento.document;
import com.example.mongoFord.monguinho.MongoData;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    private final MongoData mongoData;

    public HealthService(MongoData mongoData) {
        this.mongoData = mongoData;
    }

    public document createUser(document document) {
        return  mongoData.createDoc(document);
    }
}
