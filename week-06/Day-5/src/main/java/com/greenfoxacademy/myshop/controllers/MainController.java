package com.greenfoxacademy.myshop.controllers;

import com.greenfoxacademy.myshop.models.ItemType;

import com.greenfoxacademy.myshop.models.ShopStock;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@Controller
public class MainController {
    ShopStock shop = new ShopStock(true);
    @GetMapping(value = {"/", "/webshop"})
    public String show(Model m){

        m.addAttribute("shop",shop.getStockList());
        return "webshop";
    }
    @GetMapping(value = {"/", "/more-filters"})
    public String more(Model m){

        m.addAttribute("shop",shop.getStockList());
        return "more-filters";
    }

    @GetMapping(value = "/only_available" )
    public String available(Model m){

        m.addAttribute("shop",shop.getAvailableStock());
        return "webshop";
    }

    @GetMapping(value = "/cheapest_first" )
    public String ordered(Model m){

        m.addAttribute("shop",shop.getOrderPrice());
        return "webshop";
    }

    @GetMapping(value = "/average_stock" )
    public String getAvgStock(Model m){
        m.addAttribute("shop",shop.getStockList());
        m.addAttribute("avgShop",shop.getAvgStock());
        return "webshop";
    }

    @GetMapping(value = "/contains_nike" )
    public String nike(Model m){

        m.addAttribute("shop",shop.getNike());
        return "webshop";
    }

    @PostMapping("/search_result")
    public String searchItem(@RequestParam String search, Model m){
        m.addAttribute("shop",shop.getSearchedText(search));
        return "webshop";
    }

    @GetMapping("/most_expensive_available")
    public String mostExpensive(Model m){
        m.addAttribute("shop", Arrays.asList(shop.getMostExpensive()));
        return "webshop";
    }

    @GetMapping("/filter-by-type")
    public String getType(@RequestParam ("type") String type, Model m){
        m.addAttribute("shop", shop.getType(ItemType.valueOf(type)));
        //m.addAttribute("shop", Arrays.asList(shop.getMostExpensive()));
        return "more-filters";
    }
}
