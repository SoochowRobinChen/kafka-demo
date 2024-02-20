package com.robinchen.kafkademo.consumer;

import com.robinchen.kafkademo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    private final String TOPIC_NAME = "kafka-demo";

    @KafkaListener(topics = TOPIC_NAME, groupId = "myGroup")
    public void consumeMessage(User user){
        log.info("Consume message from Kafka topic :: {}, and content is :: {}", TOPIC_NAME, user);
    }
}
