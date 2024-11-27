package org.umc_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UmcProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmcProjectApplication.class, args);
    }

}
