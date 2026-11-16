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
