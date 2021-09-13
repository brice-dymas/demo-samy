package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Projet :  demo
 * Package :  com.example.model
 * File :  Product
 * Created on : 2021, Monday 13 of September
 * Created at : 5:26 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends MainEntity{

    private String name;
    private Long quantity;
    private Double price;

    @ManyToOne
    private Category category;

}
