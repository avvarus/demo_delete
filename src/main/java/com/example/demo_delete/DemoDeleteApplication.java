package com.example.demo_delete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDeleteApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDeleteApplication.class, args);
    }


    @GetMapping(value = "/he")
    public String getSer() {
        return "qwerty";
    }

}
