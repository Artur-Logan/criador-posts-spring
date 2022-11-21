package com.arturlogan.criadorpostsspring.v1.mappers;

import com.arturlogan.criadorpostsspring.v1.dto.request.CreatePostRequest;
import com.arturlogan.criadorpostsspring.v1.dto.response.CreatePostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperCreatePost {

    Post toEntity(CreatePostRequest request);
    CreatePostResponse toResponse(Post post);
}
