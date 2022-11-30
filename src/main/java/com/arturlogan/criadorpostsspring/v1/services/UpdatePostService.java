package com.arturlogan.criadorpostsspring.v1.services;

import com.arturlogan.criadorpostsspring.v1.dto.request.UpdatePostRequest;
import com.arturlogan.criadorpostsspring.v1.dto.response.UpdatePostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import com.arturlogan.criadorpostsspring.v1.exceptions.PostNotFoundException;
import com.arturlogan.criadorpostsspring.v1.mappers.MapperUpdatePost;
import com.arturlogan.criadorpostsspring.v1.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdatePostService {

    private final PostRepository postRepository;
    private final MapperUpdatePost mapperUpdatePost;

    public UpdatePostResponse updatePostResponse (Long id, UpdatePostRequest updatePostRequest){
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("Post não encontrado no banco de dados."));

        mapperUpdatePost.update(updatePostRequest, post);

        postRepository.save(post);

        UpdatePostResponse updatePostResponse = mapperUpdatePost.toResponse(post);
        return updatePostResponse;
    }
}
