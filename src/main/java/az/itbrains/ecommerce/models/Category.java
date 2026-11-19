package az.itbrains.ecommerce.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name = "Categories")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id;

    @Column(length = 50, nullable=false)
     String name;

    @Column(length = 100)
     String description;

    boolean isFeatured;


    @OneToMany(mappedBy = "category")
    List<SubCategory> subCategories = new ArrayList<>();
}

//VB-daki cedvellerle birbasa uygun gelen ve Hibernate/JPA vasiteisle
//cedvelleri idare ededn obyekt siniflerini ozunde saxlayir.
//Category-> bazadaki categories cedvelini temsil edir
//Product-> mehsul cedveline uygun gelen mehsulun adi,  qiymeti, tesvir
//SubCategory-> alt kat cedvelini temsil edir
//User-> sistemden qeydiyyatdan kecen istifadecilerin info.larini(ad, id, password) saxlayan istifadeci modelidir
