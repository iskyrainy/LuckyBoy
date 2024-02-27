package com.luckyboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LuckyBoyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuckyBoyApplication.class, args);
    }

}
