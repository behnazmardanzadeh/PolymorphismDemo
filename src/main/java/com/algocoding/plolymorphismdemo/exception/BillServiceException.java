package com.algocoding.plolymorphismdemo.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BillServiceException extends RuntimeException {
    public BillServiceException(Throwable throwable) {
        super(throwable);
    }
}
