package org.example.fjencinas;

import lombok.RequiredArgsConstructor;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.usecase.ItemUseCase;
import org.instancio.Instancio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ItemUseCase itemUseCase;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Item item = Instancio.of(Item.class).create();
        itemUseCase.createItem(item);
        itemUseCase.findItem(item.getId())
                .ifPresent(i -> System.out.println("Item found: " + i.getName()));
    }
}
