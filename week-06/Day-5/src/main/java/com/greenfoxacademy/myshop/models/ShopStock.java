package com.greenfoxacademy.myshop.models;

import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private List<ShopItem> stockList;
    public ShopStock(){
        this.stockList = new ArrayList<>();
    }
    public ShopStock(boolean demo){
        this();
        if (demo){
            this.stockList.add(new ShopItem("Running shoes","Nike running shoes for every day sport",1000,5));
            this.stockList.add(new ShopItem("Printer","Some HP printer that will print pages",3000,2));
            this.stockList.add(new ShopItem("Coca cola","0.5l standard coke",25,0));
            this.stockList.add(new ShopItem("Wokin","Chicken with fried rice and WOKIN sauce",119,100));
            this.stockList.add(new ShopItem("T-shirt","Blue with a corgi on a bike",300,1));
        }
    }

    public List<ShopItem> getStockList() {
        return stockList;
    }

    public void setStockList(List<ShopItem> stockList) {
        this.stockList = stockList;
    }
}