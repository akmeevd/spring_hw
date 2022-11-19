package com.example.spring_hw.model;


import java.util.ArrayList;

public class Basket {
    private ArrayList<Integer> ids;

    public Basket(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "ids=" + ids +
                '}';
    }

}
