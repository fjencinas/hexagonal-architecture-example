package org.example.fjencinas.domain.repository;

import org.example.fjencinas.domain.entity.Item;

import java.util.Optional;

public interface Read {
    Optional<Item> findById(String id);
}
