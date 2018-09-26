package com.cc.gmp.consumer.common;

public class ManagementException extends RuntimeException {
    private static final long serialVersionUID = -1425976313294834867L;

    public ManagementException() {
        super();
    }

    public ManagementException(String message) {
        super(message);
    }

    public ManagementException(Throwable e) {
        super(e);
    }
    public ManagementException(String message, Throwable e) {
        super(message, e);
    }
}
