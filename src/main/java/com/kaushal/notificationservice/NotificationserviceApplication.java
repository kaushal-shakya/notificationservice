package com.kaushal.notificationservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class NotificationserviceApplication {

    private final Logger logger = LoggerFactory.getLogger(NotificationserviceApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(NotificationserviceApplication.class, args);
	}

    @KafkaListener(topics = "newaccounttopic")
    public void listen1(String msg) {
        logger.info("Received to listen1: " + msg);
    }

    @KafkaListener(topics = "newaccounttopic")
    public void listen2(String msg) {
        logger.info("Received to listen2: " + msg);
    }

    @KafkaListener(topics = "newaccounttopic")
    public void listen3(String msg) {
        logger.info("Received to listen3: " + msg);
    }
}
