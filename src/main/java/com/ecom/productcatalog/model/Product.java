package com.ecom.productcatalog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;


    @ManyToOne
    @JoinColumn(name="category_id",nullable = false) //remember we will get the foregin id in this table


    private Category category;
}
