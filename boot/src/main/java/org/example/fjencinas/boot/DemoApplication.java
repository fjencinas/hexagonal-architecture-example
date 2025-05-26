package org.example.fjencinas.boot;

import lombok.RequiredArgsConstructor;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.usecase.ItemUseCase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    private final ItemUseCase itemUseCase;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        itemUseCase.findItem(Item.builder().code("1").build())
                .ifPresent(item -> System.out.println("Item found: " + item.getName()));
    }
}
