package com.chkyu.demokafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaSampleConsumerService {
    @KafkaListener(topics = "topic1", groupId = "groupId1")
    public void consume(String message) throws Exception {
        System.out.println("receive message : " + message);
    }
}
