package org.techeer.study.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.techeer.study.service.posts.PostsService;
import org.techeer.study.web.dto.PostsResponseDto;
import org.techeer.study.web.dto.PostsSaveRequestDto;
import org.techeer.study.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
