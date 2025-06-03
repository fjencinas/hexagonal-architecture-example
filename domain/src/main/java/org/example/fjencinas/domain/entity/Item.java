package org.example.fjencinas.domain.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
public class Item {
    private UUID uuid;
    private String code;
    private String name;
    private JsonNode data;
}
