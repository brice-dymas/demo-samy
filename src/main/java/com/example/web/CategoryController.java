package com.example.web;

import com.example.model.Category;
import com.example.services.inter.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Projet :  demo
 * Package :  com.example.web
 * File :  CategoryController
 * Created on : 2021, Monday 13 of September
 * Created at : 5:55 AM
 * Author name : Brice dymas
 * Author's mail : briceguemkam@gmail.com / brice.guemkam@iforce5.com
 */
@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/list")
    public ResponseEntity<List<Category>> getAll() {
        return ResponseEntity.ok(categoryService.findAll());
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<Category> getOne(@PathVariable Long id) {
        final Optional<Category> prod = categoryService.findById(id);
        return prod.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/{id}/delete")
    public void deleteOne(@PathVariable Long id) {
        categoryService.delete(id);
    }

    @PutMapping("/update")
    public ResponseEntity<Category> update(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.save(category));
    }

    @PostMapping("/save")
    public ResponseEntity<Category> save(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.save(category));
    }
}
