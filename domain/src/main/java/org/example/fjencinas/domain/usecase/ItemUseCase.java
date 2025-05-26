package org.example.fjencinas.domain.usecase;

import org.example.fjencinas.domain.entity.Item;

import java.util.Optional;

public interface ItemUseCase {

    Optional<Item> findItem(Item item);

}
