package com.example.spring_hw.model;

import java.util.List;


public class Basket {

    private final List<Integer> ids;

    public Basket(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "ids=" + ids +
                '}';
    }

}


