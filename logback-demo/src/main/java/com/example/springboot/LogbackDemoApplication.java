package com.example.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LogbackDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackDemoApplication.class, args);
        String info = "yeyouruiwen";
        log.info(info);
    }

}
