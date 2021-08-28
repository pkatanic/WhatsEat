package ru.gb.whatseat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.whatseat.model.ProductsList;
import ru.gb.whatseat.repository.DishRepository;

@Service
@RequiredArgsConstructor
public class DishService {

    private final DishRepository dishRepository;

    public String getDish(){
        /**
         * Сюда добавить получение рецепта.
         */
        String myDish = dishRepository.getDish();
        return myDish;
    }

    public void findDish(ProductsList productsList) {
        String[] products = productsList.getProducts().split("\\s+");
        /**
         * Тут будет логика поиска рецепта и сохранения его в определенное поле.
         */
        for (int i = 0; i < products.length; i++) {
            if(products[i].contains("яйцо")){
                dishRepository.save("Яичница");
                return;
            }
        }
        dishRepository.save("Ничего не найдено");
    }
}
