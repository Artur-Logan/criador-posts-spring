package com.arturlogan.criadorpostsspring.v1.mappers;

import com.arturlogan.criadorpostsspring.v1.dto.response.UpdatePostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MapperUpdatePost {

    UpdatePostResponse toResponse(Post post);
    Post update(UpdatePostResponse updatePostResponse, @MappingTarget Post post);
}
