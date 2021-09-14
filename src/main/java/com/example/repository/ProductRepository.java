package com.example.repository;

import com.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Projet :  demo
 * Package :  com.example.repository
 * File :  ProductRepository
 * Created on : 2021, Monday 13 of September
 * Created at : 5:28 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
