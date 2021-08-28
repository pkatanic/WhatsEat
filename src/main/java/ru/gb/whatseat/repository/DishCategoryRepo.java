package ru.gb.whatseat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.whatseat.entity.DishCategoryEntity;

public interface DishCategoryRepo extends CrudRepository<DishCategoryEntity, Long> {

    DishCategoryEntity findByTitle(String title);
}
