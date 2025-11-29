package com.example.openshiftlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OpenshiftLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftLearningApplication.class, args);
    }

    @GetMapping
    public String api() {

        return "Hello World-1!";

    }

}
