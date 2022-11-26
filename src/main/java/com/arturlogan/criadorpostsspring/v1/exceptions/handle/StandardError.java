package com.arturlogan.criadorpostsspring.v1.exceptions.handle;

import lombok.Data;

import java.time.Instant;

@Data
public class StandardError {

    private Instant timestamp;
    private Integer status;
    private String message;
    private String path;
}
