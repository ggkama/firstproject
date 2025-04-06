package com.myproject.project1.member.dao;

import com.myproject.project1.member.vo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * MyBatis용 인터페이스 - users 테이블 연동
 */
@Mapper
public interface UserMapper {
    int insertUser(User user);      // 회원가입
    User findById(String id);       // 로그인 시 ID 조회
}
