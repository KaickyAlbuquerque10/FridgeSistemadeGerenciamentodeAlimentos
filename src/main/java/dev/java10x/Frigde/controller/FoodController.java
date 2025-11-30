package dev.java10x.Frigde.controller;

import dev.java10x.Frigde.model.Food;
import dev.java10x.Frigde.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {


    // injeçao de dependencia


    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll () {return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food ) {return foodService.save(food);}

    @DeleteMapping ("/{id}")
    public void delete (@PathVariable Long id) {foodService.delete(id);}

}
