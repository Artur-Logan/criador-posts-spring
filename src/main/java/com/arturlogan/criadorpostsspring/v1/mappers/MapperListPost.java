package com.arturlogan.criadorpostsspring.v1.mappers;


import com.arturlogan.criadorpostsspring.v1.dto.response.ListPostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperListPost {

    ListPostResponse toResponse(Post post);
}