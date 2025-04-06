package com.myproject.project1.member.service;

import com.myproject.project1.member.vo.User;

/**
 * 사용자 서비스 인터페이스
 */
public interface UserService {
    int register(User user);       // 회원가입
    User login(String id);         // 로그인 시 ID로 정보 조회
}
