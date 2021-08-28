package ru.gb.whatseat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.whatseat.entity.ProductCategoryEntity;

public interface ProductCategoryRepo extends CrudRepository<ProductCategoryEntity, Long> {

    ProductCategoryEntity findByTitle(String title);
}
