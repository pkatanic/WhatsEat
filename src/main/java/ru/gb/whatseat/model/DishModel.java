package ru.gb.whatseat.model;

import lombok.Data;
import ru.gb.whatseat.entity.DishEntity;
import ru.gb.whatseat.entity.RecipeEntity;

import java.util.List;

@Data
public class DishModel {

    private String title;
    private String description;
    private List<RecipeEntity> recipes;

    public static DishModel toModel(DishEntity dishEntity){
        DishModel model = new DishModel();
        model.setTitle(dishEntity.getTitle());
        model.setDescription(dishEntity.getDescription());
        model.setRecipes(dishEntity.getRecipes());
        return model;
    }
}
