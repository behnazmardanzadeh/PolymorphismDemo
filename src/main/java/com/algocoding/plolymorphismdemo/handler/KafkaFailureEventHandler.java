package com.algocoding.plolymorphismdemo.handler;

public interface KafkaFailureEventHandler<KafkaFailureEventDto> {
    void onFailure(KafkaFailureEventDto dto);
}
