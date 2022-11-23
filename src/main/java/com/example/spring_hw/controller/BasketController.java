package com.example.spring_hw.controller;

import com.example.spring_hw.model.Basket;
import com.example.spring_hw.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketController {

    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping({"/store/order/add"})
    public Basket addInBasket(@RequestParam("id") List<Integer> ids) {
        return this.basketService.addInBasket(ids);
    }

    @GetMapping("/store/order/get")
    public Basket getBasket() {
        return this.basketService.getBasket();
    }
}
