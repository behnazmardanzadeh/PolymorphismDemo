package com.algocoding.plolymorphismdemo.handler;


import com.algocoding.plolymorphismdemo.KafkaFailureEventDto;

public class BillBatchApiDenyHandler implements KafkaFailureEventHandler<KafkaFailureEventDto> {
    @Override
    public void onFailure(KafkaFailureEventDto kafkaFailureEventDto) {
        System.out.println(kafkaFailureEventDto.getMethod());
    }
}
