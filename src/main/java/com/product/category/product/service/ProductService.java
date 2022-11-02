package com.product.category.product.service;

import com.product.category.product.model.Product;
import com.product.category.product.repository.CategoryRepository;
import com.product.category.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    public List<Product> allProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) throws Exception {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isEmpty()) {
            throw new Exception();
        }
        return optional.get();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void removeProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) productRepository.deleteById(id);
    }

    public List<Product> getProductsByCategory(int id) {
        return productRepository.getProductsByCategory(categoryRepository.findById(id).get());
    }
}