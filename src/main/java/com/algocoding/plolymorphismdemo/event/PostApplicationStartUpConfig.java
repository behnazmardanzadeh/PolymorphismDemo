package com.algocoding.plolymorphismdemo.event;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

@Configuration
@AllArgsConstructor
public class PostApplicationStartUpConfig {
    private List<Initializer> initializers;

    @EventListener(ApplicationReadyEvent.class)
    @Async
    public void startUp() {
        initializers.forEach(Initializer::init);
    }

}
