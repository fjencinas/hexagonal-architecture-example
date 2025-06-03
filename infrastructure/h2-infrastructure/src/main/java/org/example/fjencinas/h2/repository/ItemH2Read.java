package org.example.fjencinas.h2.repository;

import lombok.RequiredArgsConstructor;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.repository.Read;
import org.example.fjencinas.h2.mapper.ItemH2Mapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ItemH2Read implements Read {

    private final ItemH2Repository itemH2Repository;

    private final ItemH2Mapper itemH2Mapper;

    @Override
    public Optional<Item> find(String id) {
        return itemH2Repository.findById(Long.valueOf(id)).map(itemH2Mapper::toDomain);
    }

}
