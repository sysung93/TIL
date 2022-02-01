package com.example.interceptor.controller;

import com.example.interceptor.annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//내부사용자, 세션이 인증된 사용자만
@RestController
@RequestMapping("/api/private")
//세션이 있으면 통과, 없으면 통과 x
@Auth
@Slf4j
public class PrivateController {
    @GetMapping("/hello")
    public String hello(){
        log.info("private hello controller");
        return "private hello";
    }
}
