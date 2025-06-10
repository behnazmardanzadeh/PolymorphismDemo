package com.algocoding.plolymorphismdemo.event;

import com.algocoding.plolymorphismdemo.handler.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EventHandlerRegistryInitializer implements Initializer{
    private EventHandlerRegistry eventHandlerRegistry;

    @Override
    public void init() {
        eventHandlerRegistry.register(OutBoxExceptionContainer.BILL_BATCH_API_CANCEL, new BillBatchApiCancelHandler());
        eventHandlerRegistry.register(OutBoxExceptionContainer.BILL_BATCH_API_DENY, new BillBatchApiDenyHandler());
        eventHandlerRegistry.register(OutBoxExceptionContainer.BILL_BATCH_CONFIRM_API, new BillBatchConfirmApiHandler());
        eventHandlerRegistry.register(OutBoxExceptionContainer.BILL_BATCH_CREATE_API, new BillBatchCreateApiHandler());
        eventHandlerRegistry.register(OutBoxExceptionContainer.BILL_BATCH_LIMIT_CONFIRM, new BillBatchLimitConfirmHandler());
    }
}
