package ru.gb.whatseat.model;

import lombok.Data;
import ru.gb.whatseat.entity.ProductCategoryEntity;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ProductCategoryModel {

    private String title;
    private List<ProductModel> products;

    public static ProductCategoryModel toModel(ProductCategoryEntity entity){
        ProductCategoryModel model = new ProductCategoryModel();
        model.setTitle(entity.getTitle());
        model.setProducts(entity.getProducts().stream().map(ProductModel::toModel).collect(Collectors.toList()));
        return model;
    }
}
