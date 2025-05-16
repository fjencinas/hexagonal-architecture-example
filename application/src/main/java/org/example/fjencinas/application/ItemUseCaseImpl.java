package org.example.fjencinas.application;

import lombok.extern.slf4j.Slf4j;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.usecase.ItemUseCase;

@Slf4j
public class ItemUseCaseImpl implements ItemUseCase {

    @Override
    public void MyItemUseCase(Item item) {
        log.info("Item: {}", item);
    }

}

