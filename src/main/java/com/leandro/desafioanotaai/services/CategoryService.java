package com.leandro.desafioanotaai.services;

import com.leandro.desafioanotaai.domain.category.Category;
import com.leandro.desafioanotaai.domain.category.CategoryDTO;
import com.leandro.desafioanotaai.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category insert(CategoryDTO categoryData){
        Category newCategory = new Category(categoryData);
        this.repository.save(newCategory);
        return newCategory;
    }
}
