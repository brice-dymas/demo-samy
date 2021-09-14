package com.example.services.inter;

import com.example.model.Category;
import com.example.services.generics.CommonGenericCrudService;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Projet :  demo
 * Package :  com.example.services
 * File :  CategoryService
 * Created on : 2021, Monday 13 of September
 * Created at : 5:33 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
public interface CategoryService extends CommonGenericCrudService<Category> {

    public void setUpCategories();

    Page<Category> getSinglePage(Pageable pageable);
}
