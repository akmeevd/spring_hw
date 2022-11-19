package com.example.spring_hw.controller;

import com.example.spring_hw.model.Basket;
import com.example.spring_hw.service.BasketService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BasketController {
    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @PostMapping("/store/order/add")
    public Basket addInBasket(@RequestParam int... id) {
        return this.basketService.addInBasket(id);
    }

    @GetMapping("/store/order/get")
    public Basket getBasket() {
        return this.basketService.getBasket();
    }



}
