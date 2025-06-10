package com.algocoding.plolymorphismdemo;

import com.algocoding.plolymorphismdemo.exception.BillServiceException;
import com.algocoding.plolymorphismdemo.exception.PaymentLimitServicesException;
import com.algocoding.plolymorphismdemo.exception.WithdrawalConditionServiceException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum OutBoxExceptionContainer {

    //BILL-BATCH
    BILL_BATCH_WC_CREATE(WithdrawalConditionServiceException.class, DistributedCompensation.BILL_BATCH_CREATE, "BILL_BATCH_WC_CREATE"),
    BILL_BATCH_CREATE_API(BillServiceException.class, DistributedCompensation.BILL_BATCH_CREATE, "BILL_BATCH_API_CREATE"),
    BILL_BATCH_WC_CANCEL(WithdrawalConditionServiceException.class, DistributedCompensation.BILL_BATCH_CANCEL, "BILL_BATCH_WC_CANCEL"),
    BILL_BATCH_API_CANCEL(BillServiceException.class, DistributedCompensation.BILL_BATCH_CANCEL, "BILL_BATCH_API_CANCEL"),
    BILL_BATCH_WC_DENY(WithdrawalConditionServiceException.class, DistributedCompensation.BILL_BATCH_DENY, "BILL_BATCH_WC_DENY"),
    BILL_BATCH_API_DENY(WithdrawalConditionServiceException.class, DistributedCompensation.BILL_BATCH_DENY, "BILL_BATCH_API_DENY"),
    BILL_BATCH_CONFIRM_API(BillServiceException.class, DistributedCompensation.BILL_BATCH_CONFIRM, "BILL_BATCH_API_CONFIRM"),
    BILL_BATCH_WC_CONFIRM(WithdrawalConditionServiceException.class, DistributedCompensation.BILL_BATCH_CONFIRM, "BILL_BATCH_WC_CONFIRM"),
    BILL_BATCH_LIMIT_CONFIRM(PaymentLimitServicesException.class, DistributedCompensation.BILL_BATCH_CONFIRM, "BILL_BATCH_LIMIT_CONFIRM"),

    ;
    private final Class<? extends Throwable> outBoxFor;
    private final DistributedCompensation compensation;
    private final String method;

    OutBoxExceptionContainer(Class<? extends Throwable> outBoxFor, DistributedCompensation compensation, String method) {
        this.outBoxFor = outBoxFor;
        this.compensation = compensation;
        this.method = method;
    }
}
