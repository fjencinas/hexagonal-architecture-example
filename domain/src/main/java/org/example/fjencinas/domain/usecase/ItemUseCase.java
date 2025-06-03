package org.example.fjencinas.domain.usecase;

import org.example.fjencinas.domain.entity.Item;

import java.util.Optional;

public interface ItemUseCase {

    Optional<Item> createItem(Item item);

    Optional<Item> findItem(String id);

}
