package org.example.fjencinas.h2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "ItemH2Entity")
public class ItemH2Entity {

    @Id
    private Long id;
    private String code;
    private String name;
    private String description;

}