package com.example.kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {

    @KafkaListener(topics = "topic", groupId = "group_1")
    public void listen(String message) {
        System.out.println("Received Message in group group_1 : " + message);
    }
}
