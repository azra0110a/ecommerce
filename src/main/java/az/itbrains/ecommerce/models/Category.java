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

//
//package az.itbrains.ecommerce.models;
//
//import jakarta.persistence.*;
//JPA annotasiyalarini-> @Entity/@Table/@Id/@Column/@OnetoMany vs/ bu sinifde is .etmek ucundur
//        import lombok.*;
//        import lombok.experimental.FieldDefaults;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@FieldDefaults(level= AccessLevel.PRIVATE)
//@Entity
//Spring-e ve Hibernate-e bildirirki bu sade java sinife deyil, vb-de cedvelle qarsiliq gelen entity modelidir

//@Table(name = "Categories")
//obyektin vb-de hansi cedvdelle duzeldileceyini (Categories) gosterir
//
//public class Category {

//    @Id
//cedvelin primary key oldugunu gosterir

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//ID nomresinin elle deyil, baza terefinden avtomatik olaraq bir-bir artiralacagini deyir

//    long id;
//kateqoriyanin unikal nomresini ozunde saxlayan reqemsal sahedir
//
//    @Column(length = 50, nullable=false)
//    String name;
//
//    @Column(length = 100)
//    String description;
//
//    boolean isFeatured;
//
//
//    @OneToMany(mappedBy = "category")
//bir kateqoriya icerisinde coxlu sayda alt kateqoriya ola biler(subCategory)

//    List<SubCategory> subCategories = new ArrayList<>();
//hemin subCategory siyahisni ozunde saxlayir, birinci new Arrayist<> ile bos siyahi yaradirki
//NulPinterExcetion xetasi vermesin
//}
