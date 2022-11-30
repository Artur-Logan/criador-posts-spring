package com.arturlogan.criadorpostsspring.v1.services;

import com.arturlogan.criadorpostsspring.v1.entities.Post;
import com.arturlogan.criadorpostsspring.v1.exceptions.PostNotFoundException;
import com.arturlogan.criadorpostsspring.v1.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeletePostService {

    private final PostRepository postRepository;

    public void deletar(Long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("Post não encontrado no banco de dados."));

        postRepository.delete(post);
    }
}
