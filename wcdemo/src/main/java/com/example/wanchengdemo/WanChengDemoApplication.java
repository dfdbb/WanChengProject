package com.example.wanchengdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j
@SpringBootApplication
@ServletComponentScan
public class WanChengDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WanChengDemoApplication.class, args);
        log.info("demo is running ");
    }

}
