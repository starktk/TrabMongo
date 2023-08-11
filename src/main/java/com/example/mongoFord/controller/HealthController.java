package com.example.mongoFord.controller;

import com.example.mongoFord.documento.document;
import com.example.mongoFord.service.HealthService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity createUser(@RequestBody document document) {
        healthService.createUser(document);
        return ResponseEntity.ok().build();
    }
}
