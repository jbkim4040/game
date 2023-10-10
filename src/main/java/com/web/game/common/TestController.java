package com.web.game.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get/test")
    public TestDTO testGetAPI() {
        TestDTO dto =
                TestDTO.builder()
                        .name("김정빈")
                        .phone("01053871887")
                        .gender("남자")
                        .build();

        return dto;
    }

    @PostMapping("/post/test")
    public String testPostAPI() {
        return "이건 테스트 데이터 (post)";
    }
}
