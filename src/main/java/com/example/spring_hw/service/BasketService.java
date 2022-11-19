package com.example.spring_hw.service;

import com.example.spring_hw.model.Basket;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BasketService {
    private Basket basket;

    public Basket addInBasket(int... id) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : id) {
            list.add(j);
        }
        return this.basket = new Basket(list);
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
