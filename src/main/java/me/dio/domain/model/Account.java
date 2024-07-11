package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(precision = 13, scale = 2)
    private BigDecimal limit;


    public Account() {
    }



    public Account(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {
        this.id = id;
        this.number = number;
        this.agency = agency;
        this.balance = balance;
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

    public String getAgency() {
        return this.agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return this.limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }



}