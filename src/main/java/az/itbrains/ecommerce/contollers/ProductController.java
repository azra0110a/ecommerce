package az.itbrains.ecommerce.contollers;

import az.itbrains.ecommerce.services.ProductService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}


//import az.itbrains.ecommerce.services.ProductService;
//Məhsullarla bağlı biznes məntiqini yerinə yetirəcək olan ProductService interfeysini bu sinifdə istifadə edə bilmək
//üçün bura çağırırıq.

//import org.springframework.web.bind.annotation.RestController;
//bu sinifin xarici dunyadangelen sorgulati qebul eden idareci oldugnu spring-e bildirir
//
//@RestController
//spring-e bildirirki, bu sinif REST API kontrolleridir,burada yazilacaq olan melumatlar avtomatik olaraq
//JSON formatina cevrilir, pakte formasainda gedir
//public class ProductController {

//ProductController mehsullarla bagli emeliyyatlari birabasa ozu bazadan elemir, isleri Product Serviceye oturur
//    private final ProductService productService;
//
//    public ProductController(ProductService productService) {
//ProductServiceni heyate keciren obyektin suretini yaradir, ve bu konstruktor vasiteisle avtomatik olaraq
//bu kontrollerin icineoturur
//        this.productService = productService;
//    }
//}