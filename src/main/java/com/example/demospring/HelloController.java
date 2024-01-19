package com.example.demospring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public ResponseEntity hello() {
        return ResponseEntity.ok("배포 자동화 테스트");
    }
}
