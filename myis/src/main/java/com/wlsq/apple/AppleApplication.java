package com.wlsq.apple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppleApplication {
    @RequestMapping("/")
    String home() {
        return "欢迎使用SpringBoot!";
    }
    public static void main(String[] args) {
        SpringApplication.run(AppleApplication.class, args);
    }
}

