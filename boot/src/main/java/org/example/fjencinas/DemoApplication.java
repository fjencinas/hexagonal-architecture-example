package org.example.fjencinas;

import org.example.fjencinas.domain.repository.Read;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private Read read;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        read.findById("1").ifPresent(item -> System.out.println("Item found: " + item));
    }
}
