package com.sparta.post.service;

import com.sparta.post.dto.RequestDto;
import com.sparta.post.dto.ResponseDto;
import com.sparta.post.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    // 1. 게시글 작성
    // 제목,작성자명,비밀번호,작성 내용을 저장하고
    // 저장된 게시글을 client로 반환하기
    public ResponseDto createPost(RequestDto requestDto) {
        return null;
    }

    // 2. 게시글 전체 조회
    // 전체 조회 : 제목,작성자명, 작성 내용, 작성 날짜
    // 작성 날짜 기준, 내림차순 정렬
    public List<ResponseDto> getPosts(RequestDto requestDto) {
        return null;
    }

    // 3. 선택한 게시글 조회
    // 선택한 게시글의 제목,작성자명,작성 날짜, 작성 내용을 조회하기
    // (검색 기능이 아닌, 간단한 게시글 조회)
    public ResponseDto getPost(RequestDto requestDto) {
        return null;
    }

    // 4. 게시글 수정
    // 수정을 요청할 때 수정할 데이터와 비번을 같이 보내서 서버에서 일치 여부 확인 -> 트랜젝션 활용
    // 제목,작성자명,작성 내용 수정 후, 수정된 게시글 반환
    public ResponseDto updatePost(RequestDto requestDto) {
        return null;
    }

    // 5. 게시글 삭제
    // 삭제를 요청할 때 비밀번호를 같이 보내서 비밀번호 일치 확인 한 후
    // 선택한 게시글 삭제 client로 성공했다는 표시 반환하기 ->
    public ResponseDto deletePost(RequestDto requestDto) {
        return null;
    }
}
