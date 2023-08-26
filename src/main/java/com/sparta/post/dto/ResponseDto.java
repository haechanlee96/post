package com.sparta.post.dto;

import lombok.Getter;

@Getter
public class ResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String username;
    private int password;
}
