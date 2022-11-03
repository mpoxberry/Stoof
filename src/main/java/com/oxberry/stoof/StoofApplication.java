package com.oxberry.stoof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class StoofApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoofApplication.class, args);
    }

}
