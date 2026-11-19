package az.itbrains.ecommerce.contollers;

import az.itbrains.ecommerce.dto.CategoryHomeDTO;
import az.itbrains.ecommerce.dto.category.CategoryCreateDTO;
import az.itbrains.ecommerce.dto.category.CategoryFeaturedDTO;
import az.itbrains.ecommerce.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryHomeDTO>> getAll() {

        return new ResponseEntity<>(List.of(), HttpStatus.OK);
    }

    @GetMapping("/featured")
    public ResponseEntity<List<CategoryFeaturedDTO>> featuredCategories() {
        List<CategoryFeaturedDTO> categories = categoryService.getAllFeaturedCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);


    }

    @PostMapping("/create")
    public ResponseEntity<CategoryCreateDTO> create(@RequestBody CategoryCreateDTO createDTO) {
        CategoryCreateDTO category = categoryService.createCategory(createDTO);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

}

//controlllers qovlugu xaricden gelen HTTP sorgularini qarsiyir(get,post,put,delete)
//xaric-> frontend, React, mobil tetbiq, Postman
//CategoryController-> kateqori ile bagli olan mes: butun kat. getirmek, yeni kat duzeltmek
//ProductController->mehsullarla bagli olan mes: mehsul elave etmek, siyahilamaq
//SubCategoryController-> alt ket.larla bagli sorgulari idare edir

//dto ne ucundur? mes gelecekde category-de her hansi sutunun adinda deyisiklik etmek istrsen
//contoller birbasa category-e bagli olsaydi, frontend xeta verib cokerdi
//amma dto olduguna gore sen sadece service icindeki kodu duzeldirsen
//diger dto.lar ise deyismaz qalir, frontend.in bazadaki deyisiklikden xeberi olmur
//diger sebebi:
//category ile subCategory elaqelidir, eger onlari birbasa model/entity kimi JSON-a cevirib gondersen
//java kateqoriyanı oxuyanda alt kateqoriyaya keçəcək, alt kateqoriya təzədən ana kateqoriyaya qayıdacaq və
// proqram sonsuz dövrəyə (StackOverflowError) düşüb dayanacaq

//import az.itbrains.ecommerce.dto.CategoryHomeDTO;
//ana seh.de lazimi kat.larin hem id hem de name-i lazimdir
//bazada description/isActive sutunlarida ola biler amma onlar heleki lazim deyil

//import az.itbrains.ecommerce.dto.category.CategoryCreateDTO;
//istifadeci yeni kat duzeldende sene id gondermir, cunki id.ni baza ozu avtamati edir
//istifadeci sene yalniz name gonderir, sadace name olmasi ucun yazirsan

//import az.itbrains.ecommerce.dto.category.CategoryFeaturedDTO;
//ola bilsinki ana seh.de name-le yanasi imgUrl/productCount-da lazimdir,yeni, elave info.lar ucundur

//import org.springframework.http.HttpStatus;
//org.springframework.http->spring boot-un HTTP elaqelerini idare eden kitabxanadir
//HttpStatus-> sorgunun neticesini kodlar vasitesile gosterir
//200 ok, 404 not found , 500 internal server error , 201 created

//import org.springframework.http.ResponseEntity;
// istifadeciye gonderilmeli olan hem melumat hem de hhtp sorgu kodunu paket icinde yigir

//import org.springframework.web.bind.annotation.GetMapping;
//org.springframework.web.bind.annotation-> veb sorgulari/marsrutlari idare edir
//GetMapping->istifadecinin brauzer ve ya frontendden melumati elde et/oxumaq ucun gonderdiyi get sorgulari qarsilayir

//import org.springframework.web.bind.annotation.PostMapping;
//PostMapping-> vb.ye yeni info elave etmek/duzeltmek uucn gondeilen HTTP POST sorgularini qarsilayir

//import org.springframework.web.bind.annotation.RequestBody;
//RequestBody-> frontend-den ve ya Postman-dan gelen info.lari Body.ne baxmaq ucundur
//İstifadəçi yeni kateqoriya yaradanda ora məlumat yazır ({"name": "Elektronika"}). Bu annotasiya həmin gələn
// JSON formatındakı məlumatı oxuyub avtomatik olaraq
// Java-nın başa düşəcəyi DTO obyektinə çevirir.

//import org.springframework.web.bind.annotation.RestController;
//RestController-> xarici dunayadan gelen veb sorgularini qebul eden idareci controller oldugunu spring-e
//bildiren en esas annotasiya kitabxanasidir


//@RestController
//javaya deyirki bu sade sinif deyil, veb sorgulari qebul eden controllerdir, eyni zamanda
//metodlarin qaytardigi melumatlari avtomatik JSON formatina cevirib brauzere gonderir
//public class CategoryController {
//
//    private final CategoryService categoryService;
//controller vb ile birbasa elaqe qurmur, butun isleri gotmek ucun CategoryService interfeysine muraciet edir
//    public CategoryController(CategoryService categoryService) {
//        this.categoryService = categoryService;
//    }
//
//    @GetMapping
//eger categories unvanina elave hec ne yazilmasa bu metod ise dusur ve get sorgularini qebul edir

//    public ResponseEntity<List<CategoryHomeDTO>> getAll() {
//geri qyataracagi cavabin icinde CategoryHomeDto tipli obyektlerin List-i olacagini ve ResponseEntity qutuusnda olacag
//
//        return new ResponseEntity<>(List.of(), HttpStatus.OK);
//heleki bazadadaan info cekmediyimiz ucun geriye bos siyahi List(of) ve 200.ok status kodunu qaytarir
//    }
//
//    @GetMapping("/featured")
//istifadeci unvaninin sonuna /featured elave edib sorgu gonderende bu metod ise dusur
//    public ResponseEntity<List<CategoryFeaturedDTO>> featuredCategories() {

//        List<CategoryFeaturedDTO> categories = categoryService.getAllFeaturedCategories();
//Contoller categoryService-e deyirki: butun secilmis kat.larin siyahisini getir
//Servisde info/lari cekib getirir DTO formatinsa getirir ve categories deyiseninde daxlayir
//
//        return new ResponseEntity<>(categories, HttpStatus.OK);
//servisden gelen kat.larin siyahisini ve 200OK status kodunu paketleyerek forntend-e gonderir
//    }
//
//    @PostMapping("/create")
//vb-e yeni info eelave etmek ucun /create unvanina gonderilen HTTP sorgularini qebul edir

//    public ResponseEntity<CategoryCreateDTO> create(@RequestBody CategoryCreateDTO createDTO) {
//@RequestBody CategoryCreateDTO createDTO->  front-dan ve ya postman-dan JSON formatinda gonderilen info.nuoxuyur ve
//avtomatik olaraq CategoryCreateDTO-obyektine cevirir

//        CategoryCreateDTO category = categoryService.createCategory(createDTO);
//gelen info.nu bazaya yazmaq ucun servise oturur ve bazadan qayidan cavabi category deyisenine cevirir
//    }
//
//}