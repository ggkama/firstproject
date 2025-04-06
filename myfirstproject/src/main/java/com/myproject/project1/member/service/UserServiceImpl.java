package com.myproject.project1.member.service;

import com.myproject.project1.member.dao.UserMapper;
import com.myproject.project1.member.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 사용자 서비스 구현체
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public int register(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User login(String id) {
        return userMapper.findById(id);
    }
}
