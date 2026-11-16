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

    @OneToMany(mappedBy = "category")
    List<SubCategory> subCategories = new ArrayList<>();
}
