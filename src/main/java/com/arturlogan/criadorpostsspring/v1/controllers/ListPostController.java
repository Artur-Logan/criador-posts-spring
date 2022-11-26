package com.arturlogan.criadorpostsspring.v1.controllers;

import com.arturlogan.criadorpostsspring.v1.dto.response.ListPostResponse;
import com.arturlogan.criadorpostsspring.v1.services.ListPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/post")
public class ListPostController {

    private final ListPostService listPostService;

    @GetMapping
    public ResponseEntity<List<ListPostResponse>> listResponseEntity(){
        List<ListPostResponse> listPostResponse = listPostService.listPostResponses();

        return ResponseEntity.ok().body(listPostResponse);
    }
}
