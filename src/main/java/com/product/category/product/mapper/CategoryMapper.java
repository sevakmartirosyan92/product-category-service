package com.product.category.product.mapper;

import com.product.category.product.dto.CategoryResponseDto;
import com.product.category.product.dto.CreateCategoryDto;
import com.product.category.product.model.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    List<CategoryResponseDto> map(List<Category> categoryList);

    CategoryResponseDto map(Category category);

    Category map(CreateCategoryDto createCategoryDto);
}