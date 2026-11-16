package az.itbrains.ecommerce.services.impls;

import az.itbrains.ecommerce.repositories.CategoryRepository;
import az.itbrains.ecommerce.services.CategoryService;
import org.springframework.stereotype.Service;

@Service
//interface implement olunmus class.in obyektini goturur

public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;
    //final olduguna gore deyeri deyismek ucun, konetruktor daxilinde
    //teyin edilmelidir
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
}
