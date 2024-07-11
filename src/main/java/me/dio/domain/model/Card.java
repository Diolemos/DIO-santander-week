package me.dio.domain.model;

import java.math.BigDecimal;

public class Card {
    private Long id;
    private String number;
    private BigDecimal limit;


    public Card() {
    }

    public Card(Long id, String number, BigDecimal limit) {
        this.id = id;
        this.number = number;
        this.limit = limit;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return this.limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }



}
