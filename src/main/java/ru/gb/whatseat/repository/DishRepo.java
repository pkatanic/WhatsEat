package ru.gb.whatseat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gb.whatseat.entity.DishEntity;

public interface DishRepo extends CrudRepository<DishEntity, Long> {

    DishEntity findByTitle(String title);
}
