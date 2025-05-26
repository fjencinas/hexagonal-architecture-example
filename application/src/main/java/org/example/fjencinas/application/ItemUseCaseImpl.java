package org.example.fjencinas.application;

import lombok.RequiredArgsConstructor;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.repository.Read;
import org.example.fjencinas.domain.usecase.ItemUseCase;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemUseCaseImpl implements ItemUseCase {

    private final Read read;

    @Override
    public Optional<Item> findItem(Item item) {
        return read.find(item.getCode());
    }

}

