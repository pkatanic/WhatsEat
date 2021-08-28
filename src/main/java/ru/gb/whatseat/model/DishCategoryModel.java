package ru.gb.whatseat.model;

import lombok.Data;
import ru.gb.whatseat.entity.DishCategoryEntity;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class DishCategoryModel {

    private String title;
    private List<DishModel> dishes;

    public static DishCategoryModel toModel(DishCategoryEntity entity){
        DishCategoryModel model = new DishCategoryModel();
        model.setTitle(entity.getTitle());
        model.setDishes(entity.getDishes().stream().map(DishModel::toModel).collect(Collectors.toList()));
        return model;
    }
}
