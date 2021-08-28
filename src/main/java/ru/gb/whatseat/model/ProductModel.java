package ru.gb.whatseat.model;

import lombok.Data;
import ru.gb.whatseat.entity.ProductEntity;
import ru.gb.whatseat.entity.RecipeEntity;

import java.util.List;

@Data
public class ProductModel {

    private String title;
    private List<RecipeEntity> recipes;

    public static ProductModel toModel(ProductEntity productEntity){
        ProductModel model = new ProductModel();
        model.setTitle(productEntity.getTitle());
        model.setRecipes(productEntity.getRecipes());
        return model;
    }
}
