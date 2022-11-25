package com.arturlogan.criadorpostsspring.v1.services;

import com.arturlogan.criadorpostsspring.v1.dto.response.ListPostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import com.arturlogan.criadorpostsspring.v1.mappers.MapperListPost;
import com.arturlogan.criadorpostsspring.v1.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListPostService {

    private final MapperListPost mapperListPost;
    private final PostRepository postRepository;

    public List<ListPostResponse> listPostResponses(){
        List<Post> postList = postRepository.findAll();


        return postList.stream().map(mapperListPost::toResponse).collect(Collectors.toList());
    }
}
