package com.algocoding.plolymorphismdemo.event.billbatch;

import com.algocoding.plolymorphismdemo.event.DistributedCompensation;
import com.algocoding.plolymorphismdemo.event.KafkaEventType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BillBatchWcCancel implements KafkaEventType {

    private final Class<? extends Throwable> outBoxFor;
    private final DistributedCompensation compensation;
    private final String method;

    @Override
    public Class<? extends Throwable> getOutBoxFor() {
        return this.outBoxFor;
    }

    @Override
    public DistributedCompensation getCompensation() {
        return this.compensation;
    }

    @Override
    public String getMethod() {
        return this.method;
    }
}
