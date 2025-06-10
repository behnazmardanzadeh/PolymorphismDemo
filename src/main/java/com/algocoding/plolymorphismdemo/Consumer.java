package com.algocoding.plolymorphismdemo;

import org.springframework.stereotype.Service;

@Service
public class Consumer {

    public void listen(KafkaFailureEventDto eventDto) {
        System.out.println(eventDto);
    }
}
