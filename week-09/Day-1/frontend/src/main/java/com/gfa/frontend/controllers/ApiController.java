package com.gfa.frontend.controllers;

import models.Doubling;
import models.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/doubling")
    public Object doubling (@RequestParam (required = false) String number){
        if (number==null) return (new Error());
        try {
            Integer.parseInt(number);
            Doubling doubling = new Doubling(Integer.parseInt(number));
            return doubling;
        }
        catch( NumberFormatException e ) {
            return (new Error("Its not an integer!"));
        }
    }
}
