package com.gfa.todo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @GetMapping(value = {"/","/list",""})
    @ResponseBody
    public String list(Model m){
        return "This is My First Todo!";
    }
}
