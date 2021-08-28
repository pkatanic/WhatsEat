package ru.gb.whatseat.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.whatseat.model.ProductsList;
import ru.gb.whatseat.service.DishService;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final DishService dishService;

    @GetMapping
    public String first(Model model){
        model.addAttribute("dish", dishService.getDish());
        return "main";
    }

    @PostMapping("/")
    public String inProducts(@ModelAttribute ProductsList productsList){
        dishService.findDish(productsList);
        return "redirect:/";
    }
}
