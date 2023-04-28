package com.test.developertest.models;


import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "items")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;



    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return "Наименование продукта{" +
                "name='" + name + '\'' +
                '}';
    }

}
