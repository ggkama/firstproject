package com.myproject.project1.member.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * users 테이블과 매핑되는 VO (Value Object)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String id;         // 로그인 아이디 (PK)
    private String name;       // 이름
    private String address;    // 주소
    private String phone;      // 전화번호
    private String password;   // 비밀번호
    private String createDate; // 가입일 (SYSDATE)
}
