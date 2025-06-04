package org.example.fjencinas;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.usecase.ItemUseCase;
import org.instancio.Instancio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.instancio.Select.field;

@SpringBootApplication
@EnableJpaRepositories
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ItemUseCase itemUseCase;

    @Autowired
    private ObjectMapper objectMapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Item item = Instancio.of(Item.class)
                .set(field(Item::getId), Instancio.create(int.class).toString())
                .supply(field(Item::getData), () -> objectMapper.createObjectNode().put("generated", "value"))
                .create();
        itemUseCase.createItem(item);
        itemUseCase.findItem(item.getId()).ifPresent(i -> System.out.println("Item found: " + i.getName()));
    }
}
