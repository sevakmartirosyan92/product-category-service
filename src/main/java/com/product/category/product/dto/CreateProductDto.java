package com.product.category.product.dto;

import com.product.category.product.model.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductDto {

    private String title;
    private double price;
    private int count;
    private Category category;
}
