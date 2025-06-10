package com.algocoding.plolymorphismdemo.event;

import com.algocoding.plolymorphismdemo.KafkaFailureEventDto;
import com.algocoding.plolymorphismdemo.handler.KafkaFailureEventHandler;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class EventHandlerRegistry {
    private static EventHandlerRegistry INSTANCE;
    private final Map<OutBoxExceptionContainer, KafkaFailureEventHandler<KafkaFailureEventDto>> eventTypeEventHandlerMap;

    private EventHandlerRegistry(Map<OutBoxExceptionContainer, KafkaFailureEventHandler<KafkaFailureEventDto>> eventTypeEventHandlerMap) {
        this.eventTypeEventHandlerMap = eventTypeEventHandlerMap;
    }

    public static EventHandlerRegistry getInstance(Map<OutBoxExceptionContainer, KafkaFailureEventHandler<KafkaFailureEventDto>> eventTypeEventHandlerMap){
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new EventHandlerRegistry(eventTypeEventHandlerMap);
        }
        return INSTANCE;
    }

    public void register(OutBoxExceptionContainer key, KafkaFailureEventHandler<KafkaFailureEventDto> EventHandler) {
        eventTypeEventHandlerMap.put(key, EventHandler);
    }

    public Optional<KafkaFailureEventHandler<KafkaFailureEventDto>> resolve(OutBoxExceptionContainer key) {
        return Optional.of(eventTypeEventHandlerMap.get(key));
    }
}
