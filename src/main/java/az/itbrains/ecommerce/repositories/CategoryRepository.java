package az.itbrains.ecommerce.repositories;
//repository-> Spring-ə bildirir ki, bu interfeys məlumat bazası ilə əlaqə qurur
import az.itbrains.ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
//interface olanda -> Biz burada heç bir SQL sorğusunu əllə yazmırıq.

//extends JpaRepository<Category, Long>
//Category-repositorinin handi entity ceveli ile isleyeceyini gosterir
//Long-hemin cedveldeki id sahesinin tipini gosterir
//JpaRepository-avtomatik olaraq findAll(), save(), findBy(), delete()
//kimi metodlara avtomatik sahib olur
public interface CategoryRepository extends JpaRepository<Category, Long> {
}



//repositores-> VB ile birbasa danisan , JpaREpository-ni miraz alan interfesysleri saxlayir
// SQL sorgulari yazmadan bazadan info oxumaga ve yazmaga imkan verir
//CategoryRepository-> kat cedveli uzerinde emeliyyat aparmaq ucundur
//ProductREpository
//SubCategoryREpository
