package com.example.repository;

import com.example.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Projet :  demo
 * Package :  com.example.repository
 * File :  CategoryRepository
 * Created on : 2021, Monday 13 of September
 * Created at : 5:29 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
