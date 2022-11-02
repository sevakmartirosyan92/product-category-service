package com.product.category.product.service;

import com.product.category.product.model.Category;
import com.product.category.product.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }

    public Category getCategoryById(Long id) {
        Optional<Category> byId = categoryRepository.findById(Math.toIntExact(id));
        return byId.get();
    }
    public void removeCategoryById(Long id){
        categoryRepository.deleteById(Math.toIntExact(id));
    }
}
