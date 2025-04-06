package com.myproject.project1.member.controller;

import com.myproject.project1.member.service.UserService;
import com.myproject.project1.member.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 회원가입 / 로그인 컨트롤러
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 회원가입 요청 처리
    @PostMapping("/signup")
    public Map<String, Object> signup(@RequestBody User user) {
        int result = userService.register(user);
        Map<String, Object> response = new HashMap<>();
        response.put("result", result > 0 ? "success" : "fail");
        return response;
    }

    // 로그인 요청 처리
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody User loginData) {
        User user = userService.login(loginData.getId());

        Map<String, Object> response = new HashMap<>();
        if (user != null && user.getPassword().equals(loginData.getPassword())) {
            response.put("result", "success");
            response.put("name", user.getName());
        } else {
            response.put("result", "fail");
        }

        return response;
    }
}
