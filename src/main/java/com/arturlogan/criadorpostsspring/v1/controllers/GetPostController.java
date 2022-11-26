package com.arturlogan.criadorpostsspring.v1.controllers;

import com.arturlogan.criadorpostsspring.v1.dto.response.GetPostResponse;
import com.arturlogan.criadorpostsspring.v1.services.GetPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/post")
public class GetPostController {

    private final GetPostService getPostService;

    @GetMapping("{id}")
    public ResponseEntity<GetPostResponse> getPostResponseResponseEntity(@PathVariable Long id){
        GetPostResponse getPostResponse = getPostService.obter(id);

        return ResponseEntity.ok().body(getPostResponse);
    }


}
