package com.arturlogan.criadorpostsspring.v1.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreatePostRequest {

    @NotBlank
    private String titulo;
    @NotBlank
    private String autor;
    @NotBlank
    private String texto;
}
