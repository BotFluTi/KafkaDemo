package com.example.kafkademo.controller;

import com.example.kafkademo.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")

public class KafkaMessageController {

    @Autowired

    private MessageProducer producer;

    @PostMapping("/send")

    public String sendMessage(@RequestParam String key, @RequestParam String message) {
        producer.sendMessage(key, message);
        return "Message sent!";
    }
}
