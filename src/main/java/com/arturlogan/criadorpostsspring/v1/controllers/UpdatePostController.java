package com.arturlogan.criadorpostsspring.v1.controllers;

import com.arturlogan.criadorpostsspring.v1.dto.request.UpdatePostRequest;
import com.arturlogan.criadorpostsspring.v1.dto.response.UpdatePostResponse;
import com.arturlogan.criadorpostsspring.v1.services.UpdatePostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("v1/post")
@RequiredArgsConstructor
@RestController
public class UpdatePostController {

    private final UpdatePostService updatePostService;

    @PutMapping("/{id}")
    public ResponseEntity<UpdatePostResponse> updatePostResponseResponseEntity(@PathVariable Long id, @RequestBody UpdatePostRequest updatePostRequest){
        UpdatePostResponse updatePostResponse = updatePostService.updatePostResponse(id, updatePostRequest);

        return ResponseEntity.ok().body(updatePostResponse);
    }
}
