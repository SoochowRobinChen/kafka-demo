package com.robinchen.kafkademo.producer.service;

import com.robinchen.kafkademo.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ProducerService {

    private KafkaTemplate<String, User> kafkaTemplate;
    private final String TOPIC_NAME = "kafka-demo";

    public void sendMessage(User user){
        log.info("Start sending message to topic :: {}", TOPIC_NAME);
        kafkaTemplate.send(TOPIC_NAME, user);
        log.info("Successfully send message!");
    }
}
