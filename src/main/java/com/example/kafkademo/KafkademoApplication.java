package com.example.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.kafkademo.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class KafkademoApplication implements  CommandLineRunner {

	@Autowired
	private MessageProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(KafkademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		producer.sendMessage("Message from Spring Boot Kafka Producer");
	}
}
