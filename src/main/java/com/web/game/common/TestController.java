package com.web.game.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get/test")
    public String testGetAPI() {
        return "이건 테스트 데이터 (get)";
    }

    @PostMapping("/post/test")
    public String testPostAPI() {
        return "이건 테스트 데이터 (post)";
    }
}
