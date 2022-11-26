package com.arturlogan.criadorpostsspring.v1.exceptions;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String msg){
        super(msg);
    }
}
