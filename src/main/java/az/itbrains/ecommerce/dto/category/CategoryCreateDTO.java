package az.itbrains.ecommerce.dto.category;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class CategoryCreateDTO {
    String name;
}


//package az.itbrains.ecommerce.dto.category;
//
//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.FieldDefaults;
//
//@Data
//arxa planda avtomatik olaraq getter()/setter()/toString()/equals()/hashCode() metodlarini duzeldir

//@AllArgsConstructor
//class.in icinde butun deyisenleri avtomatik olaraq qebul eden parametrli konstruktor duzeldir

//@NoArgsConstructor
//parametr qebul etmeyen bos konstruktor duzeldir

//@FieldDefaults(level= AccessLevel.PRIVATE)
//avtomatik olaraq deyisenlerin hamisinin giris seviyyesini private edir

//public class CategoryCreateDTO {
//    String name;
//}
