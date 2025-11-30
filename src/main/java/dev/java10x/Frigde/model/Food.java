package dev.java10x.Frigde.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "food_table")
public class Food {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate expirationDate;
    private  Integer quantity;


    public Food() {
    }

    public Food(Long id, String name, LocalDate expirateonDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirateonDate;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirateonDate() {
        return expirationDate;
    }

    public void setExpirateonDate(LocalDate expirateonDate) {
        this.expirationDate = expirateonDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
