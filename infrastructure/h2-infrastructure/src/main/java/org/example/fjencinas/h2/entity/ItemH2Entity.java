package org.example.fjencinas.h2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "items")
public class ItemH2Entity {

    @Id
    private Long id;
    private String nombre;
    private String descripcion;
}