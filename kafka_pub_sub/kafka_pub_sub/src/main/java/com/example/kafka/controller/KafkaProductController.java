package com.example.kafka.controller;

import com.example.kafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaProductController {

    private final KafkaProducerService kafkaProducerService;


    @PostMapping("/send")
    public void sendMsg(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage("topic", message);
    }

}
