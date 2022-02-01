package com.example.async.controller;

import com.example.async.service.AsyncService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class ApiController {
    private final AsyncService asyncService;

    @GetMapping("hello")
    public CompletableFuture hello(){
        log.info("completable future init");
        return asyncService.run();
    }
}
