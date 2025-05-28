package org.example.fjencinas.h2.adapter;

import lombok.AllArgsConstructor;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.domain.repository.Read;
import org.example.fjencinas.h2.mapper.ItemH2Mapper;
import org.example.fjencinas.h2.repository.ItemH2Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ItemH2ReadAdapter implements Read {

    private final ItemH2Repository itemH2Repository;

    private final ItemH2Mapper itemH2Mapper;

    @Override
    public Optional<Item> read(String id) {
        return itemH2Repository.findById(Long.valueOf(id)).map(itemH2Entity -> this.itemH2Mapper.toDomain(itemH2Entity));
    }
}
