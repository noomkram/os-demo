package com.os.demo.osweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OsWebApplication.class, args);
    }


    @RestController
    public class HelloController {

        @GetMapping("/foo")
        public String helloWorld() {
            return "Hello World";
        }

    }
}
