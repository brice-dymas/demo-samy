package com.example.services.impl;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.services.generics.CommonGenericCrudServiceImpl;
import com.example.services.inter.ProductService;
import org.springframework.stereotype.Service;

/**
 * Projet :  demo
 * Package :  com.example.services
 * File :  ProductServiceImpl
 * Created on : 2021, Monday 13 of September
 * Created at : 5:35 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
@Service
public class ProductServiceImpl extends CommonGenericCrudServiceImpl<ProductRepository, Product> implements ProductService {
    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
