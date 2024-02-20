package com.robinchen.kafkademo.producer.controller;

import com.robinchen.kafkademo.model.User;
import com.robinchen.kafkademo.producer.service.ProducerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("/user")
    public void sendUser(@RequestBody User user){
        log.info("-----------------------Start--------------------------");
        log.info("Get user information from controller side :: {}", user);
        producerService.sendMessage(user);
        log.info("-----------------------End--------------------------");
    }
}
