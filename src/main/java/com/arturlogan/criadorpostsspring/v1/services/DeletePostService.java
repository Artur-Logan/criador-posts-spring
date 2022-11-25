package com.arturlogan.criadorpostsspring.v1.services;

import com.arturlogan.criadorpostsspring.v1.entities.Post;
import com.arturlogan.criadorpostsspring.v1.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeletePostService {

    private PostRepository postRepository;

    void deletar(Long id){
        Post post = postRepository.findById(id).get();

        postRepository.delete(post);
    }
}
