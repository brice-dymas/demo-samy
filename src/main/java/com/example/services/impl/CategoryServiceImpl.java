package com.example.services.impl;

import com.example.model.Category;
import com.example.repository.CategoryRepository;
import com.example.services.generics.CommonGenericCrudServiceImpl;
import com.example.services.inter.CategoryService;
import com.github.javafaker.Faker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public CategoryServiceImpl(CategoryRepository repository) {
        super(repository);
    }

    @Override
    public Page<Category> getSinglePage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void setUpCategories() {
        if (repository.count() < 1) {
            List<Category> categoryList = new ArrayList<>();
            for (int i = 0; i < 120; i++) {
                Faker faker = new Faker(new Random(17));
                categoryList.add(Category.builder().name(faker.ancient().god()).build());
            }
            repository.saveAll(categoryList);
        }
    }
}
