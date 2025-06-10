package com.algocoding.plolymorphismdemo.exception;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentLimitServicesException extends RuntimeException {

    public PaymentLimitServicesException(Throwable cause) {
        super(cause);
    }
}
