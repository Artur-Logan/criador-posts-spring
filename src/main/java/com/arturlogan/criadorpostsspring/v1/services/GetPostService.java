package com.arturlogan.criadorpostsspring.v1.services;

import com.arturlogan.criadorpostsspring.v1.dto.response.GetPostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import com.arturlogan.criadorpostsspring.v1.mappers.MapperGetPost;
import com.arturlogan.criadorpostsspring.v1.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetPostService {

    private final PostRepository postRepository;
    private final MapperGetPost mapperGetPost;

    public GetPostResponse obter(Long id){
        Post post = postRepository.findById(id).get();

        GetPostResponse getPostResponse = mapperGetPost.toResponse(post);

        return getPostResponse;
    }
}
