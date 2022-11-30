package com.arturlogan.criadorpostsspring.v1.controllers;

import com.arturlogan.criadorpostsspring.v1.services.DeletePostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/post")
@RestController
@RequiredArgsConstructor
public class DeletePostController {

    private final DeletePostService deletePostService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> responseEntity(@PathVariable Long id){
        deletePostService.deletar(id);

        return ResponseEntity.noContent().build();
    }

}
