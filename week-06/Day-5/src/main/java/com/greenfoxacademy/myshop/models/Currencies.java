package com.greenfoxacademy.myshop.models;

import java.util.HashMap;
import java.util.Map;

public class Currencies {
    private Map <String, Double> currencies;

    public Currencies(){
        this.currencies=new HashMap<>();
        this.currencies.put("Kč",1.00);
        this.currencies.put("€",27.00);
    }
    public Double getCourse(String currency){
        return this.currencies.get(currency);
    }
}
