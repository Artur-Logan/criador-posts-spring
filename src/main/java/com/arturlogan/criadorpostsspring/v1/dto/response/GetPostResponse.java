package com.arturlogan.criadorpostsspring.v1.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GetPostResponse {

    private Long id;
    private String titulo;
    private String autor;
    private LocalDate data;
    private String texto;
}
