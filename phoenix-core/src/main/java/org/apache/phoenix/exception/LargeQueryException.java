package org.apache.phoenix.exception;

public class LargeQueryException extends PhoenixIOException {
    public LargeQueryException(String reason) {
        super(reason);
    }
    private static final long serialVersionUID = 1L;
}
