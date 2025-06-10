package com.algocoding.plolymorphismdemo;

import java.io.Serializable;

public record Dto(String method,
                  String requestUUID,
                  FeatureType featureType,
                  OutBoxExceptionContainer exceptionContainer,
                  DistributedCompensation distributedCompensation)  implements Serializable {
}
