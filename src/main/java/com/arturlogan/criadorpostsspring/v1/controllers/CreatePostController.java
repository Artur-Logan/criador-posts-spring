package com.arturlogan.criadorpostsspring.v1.controllers;

import com.arturlogan.criadorpostsspring.v1.dto.request.CreatePostRequest;
import com.arturlogan.criadorpostsspring.v1.dto.response.CreatePostResponse;
import com.arturlogan.criadorpostsspring.v1.services.CreatePostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/post")
public class CreatePostController {

    private final CreatePostService createPostService;

    @PostMapping
    public ResponseEntity<CreatePostResponse> createPostResponseResponseEntity(@Valid @RequestBody CreatePostRequest request){
        CreatePostResponse createPostResponse = createPostService.salvar(request);

        return ResponseEntity.ok().body(createPostResponse);
    }
}
