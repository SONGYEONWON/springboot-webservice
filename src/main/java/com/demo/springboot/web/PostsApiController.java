package com.demo.springboot.web;

import com.demo.springboot.service.posts.PostsService;
import com.demo.springboot.web.dto.PostsResponseDto;
import com.demo.springboot.web.dto.PostsSaveRequestDto;
import com.demo.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        //영속성 컨텍스트로 인해 특별한 update 쿼리 없이 entity 변경만으로도 데이터가 저장된다.
        return postsService.update(id, requestDto);
    }


    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }


}
