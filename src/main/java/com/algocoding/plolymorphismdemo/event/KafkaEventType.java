package com.algocoding.plolymorphismdemo.event;

public interface KafkaEventType {
    Class<? extends Throwable> getOutBoxFor();
    DistributedCompensation getCompensation();
    String getMethod();
}
