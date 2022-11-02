package com.product.category.product.endpoint;

import com.product.category.product.dto.CreateCategoryDto;
import com.product.category.product.mapper.CategoryMapper;
import com.product.category.product.model.Category;
import com.product.category.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CategoryEndpoint {

    private final CategoryMapper categoryMapper;

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<?> allCategories() {
        return ResponseEntity.ok(categoryMapper.map(categoryService.allCategories()));
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(categoryMapper.map(categoryService.getCategoryById(id)));
    }

    @PostMapping("/categories")
    public ResponseEntity<?> createCategory(@RequestBody CreateCategoryDto createCategoryDto) throws Exception {
        categoryService.save(categoryMapper.map(createCategoryDto));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<?> updateCategory(@RequestBody CreateCategoryDto createCategoryDto, @PathVariable("id") Long id) throws Exception {
        Category category = categoryService.getCategoryById( id);
        category.setName(createCategoryDto.getName());
        categoryService.save(category);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<?> removeCategoryById(@PathVariable("id") Long id) {
        categoryService.removeCategoryById(id);
        return ResponseEntity.noContent().build();
    }
}