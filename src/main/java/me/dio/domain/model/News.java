package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_news")
public class News extends AbstractContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public News() {
        super();
    }

    public News(Long id, String icon, String description) {
        super(id, icon, description);
        this.id = id;
    }

   
}
