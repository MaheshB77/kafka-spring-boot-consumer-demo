package com.kafka.consumer.demo.kafkaconsumer.listener;

import com.kafka.consumer.demo.kafkaconsumer.models.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "KafkaExample", groupId = "group_id")
//    public void consumeMessage(String message) {
//        System.out.println("Consumed message : " + message);
//    }

    @KafkaListener(topics = "KafkaExample", groupId = "group_id")
    public void consumeUser(List<User> users) {
        System.out.println("Consumed user : " + users);
    }
}
