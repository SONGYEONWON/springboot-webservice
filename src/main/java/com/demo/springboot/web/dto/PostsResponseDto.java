package com.demo.springboot.web.dto;

import com.demo.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    //Posts 정보를 화면으로 리턴하기 위한 DTO
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
