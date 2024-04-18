package com.example.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        System.out.println("응답 받았다: ID = " + loginRequest.getId() + ", Password = " + loginRequest.getPassword());
        return "로그인 요청을 받았습니다.";
    }
}