package com.example.stagealarm.jwt;

import org.springframework.security.core.AuthenticationException;

public class TokenExpiredException extends AuthenticationException {
    public TokenExpiredException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public TokenExpiredException(String msg) {
        super(msg);
    }
}
