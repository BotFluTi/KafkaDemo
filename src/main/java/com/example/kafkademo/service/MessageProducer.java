package com.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service


public class MessageProducer {

    private static final String TOPIC = "string_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String key, String message) {
        kafkaTemplate.send(TOPIC, key, message);
        System.out.printf("Message sent with key '%s': %s%n", key, message);
    }
}
