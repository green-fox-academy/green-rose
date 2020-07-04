package com.greenfoxacademy.myshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopStock {
    private List<ShopItem> stockList;
    public ShopStock(){
        this.stockList = new ArrayList<>();
    }
    public ShopStock(boolean demo){
        this();
        if (demo){
            this.stockList.add(new ShopItem("Running shoes","Nike running shoes for every day sport",1000,5,ItemType.clothesAndShoes));
            this.stockList.add(new ShopItem("Printer","Some HP printer that will print pages",3000,2,ItemType.electronics));
            this.stockList.add(new ShopItem("Coca cola","0.5l standard coke",25,0,ItemType.beveragesAndSnacks));
            this.stockList.add(new ShopItem("Wokin","Chicken with fried rice and WOKIN sauce",119,100,ItemType.beveragesAndSnacks));
            this.stockList.add(new ShopItem("T-shirt","Blue with a corgi on a bike",300,1,ItemType.clothesAndShoes));
        }
    }

    public List<ShopItem> getStockList() {
        return stockList;
    }

    public void setStockList(List<ShopItem> stockList) {
        this.stockList = stockList;
    }

    public List<ShopItem> getAvailableStock() {
        return  this.stockList.stream().filter(item->item.getStock()>0).collect(Collectors.toList());
    }

    public List<ShopItem>  getSearchedText(String searchedText) {
        return this.stockList.stream()
                .filter(item -> item.getDescription().toLowerCase().contains(searchedText.toLowerCase())||item.getName().toLowerCase().contains(searchedText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<ShopItem>  getNike() {
        return this.stockList.stream()
                .filter(item -> item.getDescription().toLowerCase().contains("nike")|| item.getName().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    public List<ShopItem> getOrderPrice() {
        return this.stockList.stream().sorted().collect(Collectors.toList());
    }

    public double getAvgStock(){
        return this.stockList.stream()
                .mapToDouble(ShopItem::getPrice)
                .average()
                .orElse(0);
    }

    public ShopItem getMostExpensive(){
        return this.stockList.stream()
                .max(Comparator.comparing(ShopItem::getPrice)).orElse(null);
    }

    public List<ShopItem> getType(ItemType type) {
        return this.stockList.stream().filter(t->t.getType()==type).collect(Collectors.toList());
    }
}