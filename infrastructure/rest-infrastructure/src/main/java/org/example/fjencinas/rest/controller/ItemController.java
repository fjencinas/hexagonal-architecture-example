package org.example.fjencinas.rest.controller;

import lombok.RequiredArgsConstructor;
import org.example.fjencinas.domain.usecase.ItemUseCase;
import org.example.fjencinas.rest.mapper.ItemMapper;
import org.example.fjencinas.rest.openapi.api.ItemsApi;
import org.example.fjencinas.rest.openapi.model.ItemRequest;
import org.example.fjencinas.rest.openapi.model.ItemResponse;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
public class ItemController implements ItemsApi {

    private final ItemUseCase itemUseCase;

    private final ItemMapper itemMapper;

    @Override
    public ResponseEntity<ItemResponse> saveItem(ItemRequest itemRequest) {
        itemUseCase.createItem(itemMapper.toItem(itemRequest));
        return ItemsApi.super.saveItem(itemRequest);
    }
}
