package com.assignment.test.getsqrt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.assignment.test.getsqrt.*"})
@EnableAutoConfiguration
public class GetsqrtApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetsqrtApplication.class, args);
    }

}
