package com.chkyu.demokafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSampleProducerController {

    @Autowired
    private KafkaSampleProducerService kafkaSampleProducerService;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/sendMessage")
    public String sendMessage(String message) {
        kafkaSampleProducerService.sendMessage("test1", message);

        return HttpStatus.OK.toString();
    }

    @GetMapping("/sendMessages")
    public void sendMessages(int n){
        kafkaSampleProducerService.sendMessages(n);
    }

    @GetMapping("/ping")
    public void ping(){
        log.info("ping");
    }
    

}
