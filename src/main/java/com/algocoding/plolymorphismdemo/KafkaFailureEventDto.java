package com.algocoding.plolymorphismdemo;

import lombok.*;
import lombok.experimental.SuperBuilder;


import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Builder
@ToString
public class KafkaFailureEventDto implements Serializable {

    private String requestUUID;
    private FeatureType featureType;
    private OutBoxExceptionContainer exceptionContainer;
    private String method;
    private DistributedCompensation distributedCompensation;

}
