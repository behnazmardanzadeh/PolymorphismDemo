package com.algocoding.plolymorphismdemo.handler;

import com.algocoding.plolymorphismdemo.KafkaFailureEventDto;

public class BillBatchConfirmApiHandler implements KafkaFailureEventHandler<KafkaFailureEventDto>{
    @Override
    public void onFailure(KafkaFailureEventDto kafkaFailureEventDto) {
        System.out.println(kafkaFailureEventDto.getMethod());
    }
}
