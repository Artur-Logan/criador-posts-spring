package com.arturlogan.criadorpostsspring.v1.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UpdatePostRequest {

    private Long id;
    private String titulo;
    private String autor;
    private String texto;
}
