package org.example.fjencinas.h2.mapper;

import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.h2.entity.ItemH2Entity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemH2Mapper {
    ItemH2Entity fromDomain(Item item);

    Item toDomain(ItemH2Entity itemH2Entity);
}
