package org.example.fjencinas.rest.mapper;

import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.rest.openapi.model.ItemRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item toItem(ItemRequest itemRequest);
}