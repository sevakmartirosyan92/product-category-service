package com.product.category.product.mapper;


import com.product.category.product.dto.CreateProductDto;
import com.product.category.product.dto.ProductResponseDto;
import com.product.category.product.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    List<ProductResponseDto> map(List<Product> productList);

    ProductResponseDto map(Product product);

    Product map(CreateProductDto createProductDto);
}