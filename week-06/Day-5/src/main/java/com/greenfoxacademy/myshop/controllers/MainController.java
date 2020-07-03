package com.greenfoxacademy.myshop.controllers;

import com.greenfoxacademy.myshop.models.ShopStock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MainController {
    ShopStock shop = new ShopStock(true);
    @GetMapping(value = "/" )
    public String show(Model m){

        m.addAttribute("shop",shop.getStockList());
        return "webshop";
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

}
