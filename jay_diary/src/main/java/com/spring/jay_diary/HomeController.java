package com.spring.jay_diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  // 루트 경로로 요청이 올 경우
    public String mainPage() {
        return "main";  // templates/main.html 파일을 반환
    }
}