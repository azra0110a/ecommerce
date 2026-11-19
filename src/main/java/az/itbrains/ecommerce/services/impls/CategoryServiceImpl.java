package az.itbrains.ecommerce.services.impls;

import az.itbrains.ecommerce.dto.category.CategoryCreateDTO;
import az.itbrains.ecommerce.dto.category.CategoryFeaturedDTO;
import az.itbrains.ecommerce.dto.category.CategoryHomeDTO;
import az.itbrains.ecommerce.models.Category;
import az.itbrains.ecommerce.repositories.CategoryRepository;
import az.itbrains.ecommerce.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    @Override
    public List<CategoryHomeDTO> getAllCategories() {
        return List.of();
    }

    @Override
    public List<CategoryFeaturedDTO> getAllFeaturedCategories() {
        return List.of();
    }

    @Override
    public CategoryCreateDTO createCategory(CategoryCreateDTO createDTO) {

        Category category= new Category();
        category.setName(createDTO.getName());
        category.setFeatured(false);

        return null;
    }
}

//
//package az.itbrains.ecommerce.services.impls;
//
//import az.itbrains.ecommerce.dto.category.CategoryCreateDTO;
//import az.itbrains.ecommerce.dto.category.CategoryFeaturedDTO;
//import az.itbrains.ecommerce.dto.category.CategoryHomeDTO;
//import az.itbrains.ecommerce.models.Category;
//import az.itbrains.ecommerce.repositories.CategoryRepository;
//import az.itbrains.ecommerce.services.CategoryService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//Service Spring-e bildirirki, bu sinif biznes mentiqini idare eden bir Servicedir, Spring bu sinifin
//obyektini avtomatik olaraq yaddasda (IoC Container) duzeldir ve idare edir

//public class CategoryServiceImpl implements CategoryService {
//    private final CategoryRepository categoryRepository;
//
//    public CategoryServiceImpl(CategoryRepository categoryRepository){
//        this.categoryRepository=categoryRepository;
//Bazadan məlumat oxumaq və ya bazaya məlumat yazmaq üçün CategoryRepository interfeysinə
//ehtiyacımız var.
//}
//    @Override
//    public List<CategoryHomeDTO> getAllCategories() {
//        return List.of();
//return List.of();: Hələlik seçilmiş kateqoriyalar üçün də boş siyahı qaytaracaq şəkildə saxlanılıb.
//    }
//@Override: Bu annotasiya bildirir ki, bu metod yuxarıdakı CategoryService interfeysindən gələn məcburi metoddur
//və burada onun kodu yazılır.

//
//    @Override
//    public List<CategoryFeaturedDTO> getAllFeaturedCategories() {
//        return List.of();
//    }
//
//    @Override
//    public CategoryCreateDTO createCategory(CategoryCreateDTO createDTO) {
//Controllerden gelen ve icerisinde yeni kateqoriya adi olan DTO obyektidir

//        Category category= new Category();
//DTO-dakı məlumatı birbaşa bazaya ötürə bilmərik; əvvəlcə onu bazanın başa düşəcəyi Category (Entity / Model)
// obyektinə çevirməliyik. Buna görə yeni Category obyekti yaradırıq.

//        category.setName(createDTO.getName());
//DTO-dan gelen name-i goturub, Category obyektinin adina menimsedir

//        category.setFeatured(false);
//yeni duzeldilen kateqoriyanin ilkin olaraq isFeatured olmadigini bildiren false deyerini teyin edirik

//        return null;
//    }
//}