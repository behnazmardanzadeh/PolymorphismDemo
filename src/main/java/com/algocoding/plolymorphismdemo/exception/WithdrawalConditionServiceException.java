package com.algocoding.plolymorphismdemo.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WithdrawalConditionServiceException extends RuntimeException {

    public WithdrawalConditionServiceException(Throwable cause) {
        super(cause);
    }
}
