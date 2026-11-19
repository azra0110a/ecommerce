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
//
//import az.itbrains.ecommerce.dto.category.CategoryCreateDTO;
//import az.itbrains.ecommerce.dto.category.CategoryFeaturedDTO;
//import az.itbrains.ecommerce.dto.category.CategoryHomeDTO;
//import metodlari icerisinde istifade olunacaq DTO siniflerini ve List-i bu interfeyse daixil ediirk
//import java.util.List;
//
//public interface CategoryService {
//    List<CategoryHomeDTO> getAllCategories();
//    List<CategoryFeaturedDTO> getAllFeaturedCategories();
//    CategoryCreateDTO createCategory(CategoryCreateDTO createDTO);
//createCategory(CategoryCreateDTO createDTO): Yeni kateqoriya yaratmaq üçün istifadəçidən məlumat alıb (createDTO),
// əməliyyat bitdikdən sonra yaradılan kateqoriyanı geri qaytarmalı olan metodun imzasıdır.
//}