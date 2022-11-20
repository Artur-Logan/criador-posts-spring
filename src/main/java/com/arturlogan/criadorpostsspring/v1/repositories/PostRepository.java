package com.arturlogan.criadorpostsspring.v1.repositories;

import com.arturlogan.criadorpostsspring.v1.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
