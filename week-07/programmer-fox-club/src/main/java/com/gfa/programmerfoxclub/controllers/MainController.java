package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.models.FoxService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class MainController {

    private final FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }


    @GetMapping(value = {"/"})
    public String show(@RequestParam(required = false) String name, Model m){
        if (name == null){
            m.addAttribute("fox",foxService.getFoxByName("Mr. GreenFox"));
            m.addAttribute("foxList",foxService.foxList());
            return "index";
        } else if (foxService.getFoxByName(name)==null){
            return "redirect:login?name="+name;
        } else {
            m.addAttribute("fox",foxService.getFoxByName(name));
            m.addAttribute("foxList",foxService.foxList());
            return "index";
        }
    }

    @GetMapping(value = {"/login"})
    public String loginForm(@RequestParam(required = false) String name, Model m){
        if (name != null){
            m.addAttribute("name", name);
        }
        return "login";
    }

    @PostMapping(value = {"/login"})
    public String loginFormHandling(@RequestParam("name") String name, Model m){
        if (foxService.getFoxByName(name)==null){
            foxService.addFoxName(name);
        }
        return "redirect:/?name="+name;
    }

    @GetMapping(value = {"/nutrition-store"})
    public String nutrition(@RequestParam(required = false) String name, Model m){
        if (name == null){ name = "Mr. GreenFox";}

        if (foxService.getFoxByName(name)==null){
            return "redirect:login/?name="+name;
        } else {
            m.addAttribute("fox",foxService.getFoxByName(name));
            m.addAttribute("foodList", foxService.foodList());
            m.addAttribute("drinkList", foxService.drinkList());
            return "nutrition-store";
        }
    }

    @PostMapping(value = {"/nutrition-store"})
    public String nutritionHandled(
            @RequestParam(name = "foodId") int foodId,
            @RequestParam(name = "drinkId") int drinkId,
            @RequestParam(name = "foxId") int foxId,
            Model m
            ){
    this.foxService.chaneFoxDrink(foxId,drinkId);
    this.foxService.chaneFoxFood(foxId,foodId);
    return "redirect:/?name="+this.foxService.getFox(foxId).getName();
    }
}
