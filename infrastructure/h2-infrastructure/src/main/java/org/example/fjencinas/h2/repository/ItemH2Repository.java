package org.example.fjencinas.h2.repository;

import org.example.fjencinas.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemH2Repository extends JpaRepository<Item, Long> {

}