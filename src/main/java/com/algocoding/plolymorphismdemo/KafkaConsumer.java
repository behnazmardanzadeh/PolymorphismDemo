package com.algocoding.plolymorphismdemo;

import com.algocoding.plolymorphismdemo.event.EventHandlerRegistry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaConsumer {

    private EventHandlerRegistry eventHandlerRegistry;

    public void listen(KafkaFailureEventDto eventDto) {
        System.out.println(eventDto);
        eventHandlerRegistry.resolve(eventDto.getExceptionContainer())
                .ifPresent(eventHandler -> eventHandler.onFailure(eventDto));
    }
}
