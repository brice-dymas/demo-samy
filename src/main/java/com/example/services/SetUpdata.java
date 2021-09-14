package com.example.services;

import com.example.model.Category;
import com.example.repository.CategoryRepository;
import com.github.javafaker.Faker;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Projet :  demo
 * Package :  com.example.services
 * File :  SetUpdata
 * Created on : 2021, Monday 13 of September
 * Created at : 6:02 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
@Component
public class SetUpdata implements ApplicationListener<ContextRefreshedEvent> {
    private boolean alreadySetup = false;

    private final CategoryRepository repository;

    public SetUpdata(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (repository.count() < 1){
            List<Category> categoryList = new ArrayList<>();
            for (int i = 0; i < 120; i++) {
                Faker faker = new Faker(new Random(17));
                categoryList.add(Category.builder().name(faker.ancient().god()).build());
            }
            repository.saveAll(categoryList);
            alreadySetup = true;
        }
    }
}
