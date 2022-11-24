package com.example.spring_hw.controller;
import com.example.spring_hw.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BasketController {
    private final BasketService basketService = new BasketService();

    @GetMapping({"/store/order/add"})
    public void addInBasket(@RequestParam("id") List<Integer> ids) {
         this.basketService.addInBasket(ids);
    }

    @GetMapping("/store/order/get")
    public List<Integer> getBasket() {
        return this.basketService.getBasket();
    }
}
