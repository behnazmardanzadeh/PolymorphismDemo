package com.algocoding.plolymorphismdemo;

import com.algocoding.plolymorphismdemo.event.DistributedCompensation;
import com.algocoding.plolymorphismdemo.event.FeatureType;
import com.algocoding.plolymorphismdemo.event.OutBoxExceptionContainer;

import java.io.Serializable;

public record Dto(String method,
                  String requestUUID,
                  FeatureType featureType,
                  OutBoxExceptionContainer exceptionContainer,
                  DistributedCompensation distributedCompensation)  implements Serializable {
}
