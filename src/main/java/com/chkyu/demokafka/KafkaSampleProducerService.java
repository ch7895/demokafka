package com.chkyu.demokafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSampleProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        System.out.println("send message : " + message);
        this.kafkaTemplate.send("topic1", message);
    }

    public void sendMessage(String topic, String message) {
        System.out.println("send message : " + message);
        this.kafkaTemplate.send(topic, message);
    }


    public void sendMessages(int n) {
        
        for (int i=1; i<n+1; i++){
            kafkaTemplate.send("topic1", String.valueOf(i+"th message"));
        }
    }





}
