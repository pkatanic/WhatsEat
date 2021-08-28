package ru.gb.whatseat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.whatseat.entity.ProductEntity;

public interface ProductRepo extends CrudRepository<ProductEntity, Long> {

    ProductEntity findByTitle(String title);

}
