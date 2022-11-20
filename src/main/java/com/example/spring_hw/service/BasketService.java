package com.example.spring_hw.service;

import com.example.spring_hw.model.Basket;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;


@Service
public class BasketService {
    private Basket basket;

    public Basket addInBasket(List<Integer> ids) {
        return this.basket = new Basket(ids);
    }
    @PostConstruct
    public void init() {
        System.out.println("create!");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy!");
    }

    public Basket getBasket() {
        return this.basket;
    }


    @Override
    public String toString() {
        return "BasketService{" +
                "basket=" + basket +
                '}';
    }
}
