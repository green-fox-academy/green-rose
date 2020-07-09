package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.models.FoxService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }


    @GetMapping(value = {"/"})
    public String show(Model m){
        m.addAttribute("fox",foxService.getFoxByName("Mr. GreenFox"));
        return "index";
    }
}
