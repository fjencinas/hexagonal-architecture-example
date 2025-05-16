package org.example.fjencinas.domain.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;


@Builder(toBuilder = true)
public class Item {
    private UUID uuid;
    private String name;
    private JsonNode data;

    public static class ItemBuilder {
        public Item build() {
            Item item = Item.builder().uuid(UUID.randomUUID()).name(name).data(data).build();
            if (!item.isValid()) {
                throw new IllegalStateException("Invalid item");
            }
            return item;
        }
    }

    public boolean isValid() {
        return ObjectUtils.allNotNull(uuid, name, data)
                && StringUtils.isNotBlank(name)
                && !data.isNull();
    }
}
