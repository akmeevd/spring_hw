package com.example.spring_hw.model;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> ids = new ArrayList<>();

    public void addId(List<Integer> ids) {
        this.ids.addAll(ids);
    }

    public List<Integer> getIds() {
        return ids;
    }
    @Override
    public String toString() {
        return "Basket{" +
                "ids=" + ids +
                '}';
    }

}


