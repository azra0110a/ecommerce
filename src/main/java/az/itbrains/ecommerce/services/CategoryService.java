package az.itbrains.ecommerce.services;

import az.itbrains.ecommerce.dto.category.CategoryCreateDTO;
import az.itbrains.ecommerce.dto.category.CategoryFeaturedDTO;
import az.itbrains.ecommerce.dto.category.CategoryHomeDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryHomeDTO> getAllCategories();
    List<CategoryFeaturedDTO> getAllFeaturedCategories();
    CategoryCreateDTO createCategory(CategoryCreateDTO createDTO);
}

//CategoryService-> kateqoriya xidemetlerinin qaydalarinin teyin eden interfeys
//ProductService
//SubCategoryService
