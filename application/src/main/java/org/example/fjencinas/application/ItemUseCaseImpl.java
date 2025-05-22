package org.example.fjencinas.application;

import lombok.RequiredArgsConstructor;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.repository.Create;
import org.example.fjencinas.domain.usecase.ItemUseCase;

@RequiredArgsConstructor
public class ItemUseCaseImpl implements ItemUseCase {

    private final Create create;

    @Override
    public void MyItemUseCase(Item item) {
        create.create(item);
    }

}

