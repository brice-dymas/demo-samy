package com.example.services.impl;

import com.example.model.Category;
import com.example.repository.CategoryRepository;
import com.example.services.generics.CommonGenericCrudServiceImpl;
import com.example.services.inter.CategoryService;
import org.springframework.stereotype.Service;

/**
 * Projet :  demo
 * Package :  com.example.services
 * File :  CategoryServiceImpl
 * Created on : 2021, Monday 13 of September
 * Created at : 5:33 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
@Service
public class CategoryServiceImpl extends CommonGenericCrudServiceImpl<CategoryRepository, Category> implements CategoryService {
    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
