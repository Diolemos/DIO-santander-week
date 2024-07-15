package me.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends AbstractContent {
    public Feature() {
        super();
    }

    public Feature(Long id, String icon, String description) {
        super(id, icon, description);
    }
}
