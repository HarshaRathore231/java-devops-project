package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Harsha DevOps Project!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
