package az.itbrains.ecommerce.contollers;

import az.itbrains.ecommerce.services.SubCategoryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubCategoryController {
    private final SubCategoryService subCategoryService;

    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }
}


//package az.itbrains.ecommerce.contollers;
//
//import az.itbrains.ecommerce.services.SubCategoryService;
//Alt kateqoriyalarla bağlı bütün əməliyyatları və biznes məntiqini yerinə yetirəcək olan SubCategoryService
// interfeysini bu sinifdə istifadə edə bilmək üçün bura çağırırıq.

//import org.springframework.web.bind.annotation.RestController;
//: Bu sinfin xarici dünyadan (frontend, Postman) gələn sorğuları qəbul edən bir veb idarəçisi (Controller) olduğunu
// Spring-ə bildirmək üçün lazım olan annotasiyanın kitabxanasıdır.
//
//@RestController
//spring-e bildirirki bu sinif REST API kontrolleridie, burada yazilacq info.lar metodlar vasiltesile birbasa
// JSON formatina cevrilerek gonderilecek istifadeciye

//public class SubCategoryController {

// alt kateqoriya info.lari birbasa bazadan cekmir, isleri idare ermek ucun service-e guvenir
//    private final SubCategoryService subCategoryService;
//
//    public SubCategoryController(SubCategoryService subCategoryService) {
//SpringBoot ise due
//        this.subCategoryService = subCategoryService;
//    }
//}
