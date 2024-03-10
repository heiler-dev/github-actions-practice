package com.example.demospring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("배포 자동화 테스트");
    }
}
