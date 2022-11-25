package com.arturlogan.criadorpostsspring.v1.services;

import com.arturlogan.criadorpostsspring.v1.dto.request.UpdatePostRequest;
import com.arturlogan.criadorpostsspring.v1.dto.response.UpdatePostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
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
        Post post = postRepository.findById(id).get();

        UpdatePostResponse updatePostResponse = mapperUpdatePost.toResponse(post);
        return updatePostResponse;
    }
}
