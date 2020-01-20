package com.demo.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Posts, Long> 상속받으면 기본 crud 기 자동으로 작성된다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
