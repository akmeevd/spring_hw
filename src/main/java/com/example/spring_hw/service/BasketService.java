package com.example.spring_hw.service;
import com.example.spring_hw.model.Basket;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BasketService {
    private final Basket basket = new Basket();

    public void addInBasket(List<Integer> ids) {
        this.basket.addId(ids);
    }

    public List<Integer> getBasket() {
         return this.basket.getIds();
    }
    @Override
    public String toString() {
        return "BasketService{" +
                "basket=" + basket +
                '}';
    }
}
