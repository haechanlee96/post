package com.sparta.post.controller;

import com.sparta.post.dto.RequestDto;
import com.sparta.post.dto.ResponseDto;
import com.sparta.post.entity.Post;
import com.sparta.post.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 1. 게시글 작성
    @PostMapping("/post")
    public ResponseDto createPost(@RequestBody RequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    // 2. 게시글 전체 조회
    @GetMapping("/posts")
    public List<ResponseDto> getPosts() {
        return postService.getPosts();
    }

    // 3. 선택한 게시글 조회
    @GetMapping("/post/{id}")
    public ResponseDto getPost(@RequestBody RequestDto requestDto) {
        return postService.getPost(requestDto);
    }

    // 4. 게시글 수정
    @PutMapping("/post/{id}")
    public ResponseDto updatePost(@RequestBody RequestDto requestDto) {
        return postService.updatePost(requestDto);
    }

    // 5. 게시글 삭제
    @DeleteMapping("/post/{id}")
    public ResponseDto deletePost(@RequestBody RequestDto requestDto) {
        return postService.deletePost(requestDto);
    }
}
