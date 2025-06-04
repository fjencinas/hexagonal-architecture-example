package org.example.fjencinas.rest.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.fjencinas.domain.entity.Item;
import org.example.fjencinas.rest.openapi.model.ItemRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Map;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mapping(target = "data", source = "data", qualifiedByName = "mapToJsonNode")
    Item toItem(ItemRequest itemRequest);

    @Named("mapToJsonNode")
    default JsonNode mapToJsonNode(Map<String, Object> value) {
        try {
            return new ObjectMapper().valueToTree(value);
        } catch (Exception e) {
            return null;
        }
    }
}