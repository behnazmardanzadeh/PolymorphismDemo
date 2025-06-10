package com.algocoding.plolymorphismdemo.event;

import com.algocoding.plolymorphismdemo.event.billbatch.*;
import com.algocoding.plolymorphismdemo.exception.BillServiceException;
import com.algocoding.plolymorphismdemo.exception.PaymentLimitServicesException;
import com.algocoding.plolymorphismdemo.exception.WithdrawalConditionServiceException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class KafkaEventTypeConfig {

    @Bean
    public EventHandlerRegistry eventHandlerRegistry() {
        return EventHandlerRegistry.getInstance(new HashMap<>());
    }

    @Bean
    public BillBatchCreateApi billCreateApi() {
        return new BillBatchCreateApi(BillServiceException.class,
                DistributedCompensation.BILL_BATCH_CREATE,
                "BILL_BATCH_API_CREATE");
    }

    @Bean
    public BillBatchWcCancel billBatchWcCancel(){
        return new BillBatchWcCancel(WithdrawalConditionServiceException.class,
                DistributedCompensation.BILL_BATCH_CANCEL,
                "BILL_BATCH_WC_CANCEL");
    }

    @Bean
    public BillBatchWcCreate billBatchWcCreate(){
        return new BillBatchWcCreate(WithdrawalConditionServiceException.class,
                DistributedCompensation.BILL_BATCH_CREATE,
                "BILL_BATCH_WC_CREATE");
    }

    @Bean
    public BillBatchApiCancel billBatchApiCancel(){
        return new BillBatchApiCancel(BillServiceException.class,
                DistributedCompensation.BILL_BATCH_CANCEL,
                "BILL_BATCH_API_CANCEL");
    }

    @Bean
    public BillBatchWcDeny billBatchWcDeny(){
        return new BillBatchWcDeny(WithdrawalConditionServiceException.class,
                DistributedCompensation.BILL_BATCH_DENY,
                "BILL_BATCH_WC_DENY");
    }

    @Bean
    public BillBatchApiDeny billBatchApiDeny(){
        return new BillBatchApiDeny(WithdrawalConditionServiceException.class,
                DistributedCompensation.BILL_BATCH_DENY,
                "BILL_BATCH_API_DENY");
    }

    @Bean
    public BillBatchConfirmApi billBatchConfirmApi(){
        return new BillBatchConfirmApi(BillServiceException.class,
                DistributedCompensation.BILL_BATCH_CONFIRM,
                "BILL_BATCH_API_CONFIRM");
    }

    @Bean
    public BillBatchWcConfirm billBatchWcConfirm(){
        return new BillBatchWcConfirm(WithdrawalConditionServiceException.class,
                DistributedCompensation.BILL_BATCH_CONFIRM,
                "BILL_BATCH_WC_CONFIRM");
    }

    @Bean
    public BillBatchLimitConfirm billBatchLimitConfirm(){
        return new BillBatchLimitConfirm(PaymentLimitServicesException.class,
                DistributedCompensation.BILL_BATCH_CONFIRM,
                "BILL_BATCH_LIMIT_CONFIRM");
    }
}