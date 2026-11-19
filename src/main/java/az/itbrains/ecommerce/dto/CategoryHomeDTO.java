package az.itbrains.ecommerce.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

//data icerisinde getter setter
@Data
//butun atributlari kon. icersine alir bize getir
@AllArgsConstructor
//
@NoArgsConstructor
//birbasa private edir
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryHomeDTO {
    Long id;
    String name;
}

//DTO -> melumatlarin hamisini yox, lazimi ve tehlukesiz hissesini
//frontend-e oturur ve ya c=xaricden gelen info.larin qebul edilmesi ucun
// sinifleri saxlayir ozunde
//category qovlugu->
//product
//CategoryHomeDTO-> ana sehifede kat.lari gostermek ucun lazim olan min info.lar