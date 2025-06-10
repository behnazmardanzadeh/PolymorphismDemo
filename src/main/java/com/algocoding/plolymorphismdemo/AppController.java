package com.algocoding.plolymorphismdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/app")
public class AppController {

    private Consumer consumer;

    @GetMapping(value = "/call-service")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> callService(@RequestBody Dto dto) {

        KafkaFailureEventDto eventDto = KafkaFailureEventDto.builder()
                .method(dto.method())
                .requestUUID(dto.requestUUID())
                .distributedCompensation(dto.distributedCompensation())
                .featureType(dto.featureType())
                .exceptionContainer(dto.exceptionContainer()).build();

        consumer.listen(eventDto);

        return new ResponseEntity<>("Done", HttpStatus.OK);
    }
}
