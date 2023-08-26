package com.sparta.post.dto;

import com.sparta.post.entity.Post;
import lombok.Getter;

@Getter
public class ResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String username;
    private int password;

    public ResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.contents = post.getContents();
        this.username = post.getUsername();
//        this.password = post.getPassword();
    }
}
