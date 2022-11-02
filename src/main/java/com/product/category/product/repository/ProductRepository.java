package com.product.category.product.repository;

import com.product.category.product.model.Category;
import com.product.category.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> getProductsByCategory(Category category);
}
