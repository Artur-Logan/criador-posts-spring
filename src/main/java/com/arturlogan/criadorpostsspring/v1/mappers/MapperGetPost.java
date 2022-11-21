package com.arturlogan.criadorpostsspring.v1.mappers;

import com.arturlogan.criadorpostsspring.v1.dto.response.GetPostResponse;
import com.arturlogan.criadorpostsspring.v1.entities.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperGetPost {

    GetPostResponse toResponse(Post post);
}
