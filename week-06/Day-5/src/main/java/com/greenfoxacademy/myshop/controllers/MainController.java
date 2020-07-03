package com.greenfoxacademy.myshop.controllers;

import com.greenfoxacademy.myshop.models.ShopStock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = "/" )
    public String show(Model m){
        ShopStock shop = new ShopStock(true);
        m.addAttribute("shop",shop.getStockList());
        return "webshop";
    }

    @GetMapping(value = "/only-available" )
    public String show(Model m){
        ShopStock shop = new ShopStock(true);
        m.addAttribute("shop",shop.getStockList());
        return "webshop";
    }
}
