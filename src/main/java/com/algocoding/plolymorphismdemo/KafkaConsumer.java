package com.algocoding.plolymorphismdemo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.SameIntervalTopicReuseStrategy;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @RetryableTopic(
            attempts = "99",
            autoCreateTopics = "true",
            backoff = @Backoff(delayExpression = "30000",
                    multiplierExpression = "2"),
            sameIntervalTopicReuseStrategy = SameIntervalTopicReuseStrategy.SINGLE_TOPIC,
            include = {RuntimeException.class, Exception.class},
            timeout = "200000",
            topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE, kafkaTemplate = "kafkaTemplate")
    @KafkaListener(topics = "BILL_COMPENSATION",
            containerFactory = "kafkaListenerContainerFactory")
    public void listen(@Payload final KafkaFailureEventDto eventDto) {
        System.out.println(eventDto.toString());
    }
}
