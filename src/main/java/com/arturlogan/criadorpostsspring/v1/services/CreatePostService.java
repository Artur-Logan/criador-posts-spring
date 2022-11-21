package com.arturlogan.criadorpostsspring.v1.services;

import com.arturlogan.criadorpostsspring.v1.dto.request.CreatePostRequest;
import com.arturlogan.criadorpostsspring.v1.dto.response.CreatePostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import com.arturlogan.criadorpostsspring.v1.mappers.MapperCreatePost;
import com.arturlogan.criadorpostsspring.v1.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@RequiredArgsConstructor
@Service
public class CreatePostService {

    private final PostRepository postRepository;
    private final MapperCreatePost mapperCreatePost;

    public CreatePostResponse salvar(CreatePostRequest request){

        Post post = mapperCreatePost.toEntity(request);
        post.setData(LocalDate.now());
        postRepository.save(post);

        CreatePostResponse createPostResponse = mapperCreatePost.toResponse(post);

        return createPostResponse;
    }
}
