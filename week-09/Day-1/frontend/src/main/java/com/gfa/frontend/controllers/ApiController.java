package com.gfa.frontend.controllers;

import models.Doubling;
import models.Error;

import models.Greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ApiController {
    @GetMapping("/doubling")
    public Object doubling(@RequestParam(required = false) String number) {
        if (number == null) return (new Error());
        try {
            Integer.parseInt(number);
            Doubling doubling = new Doubling(Integer.parseInt(number));
            return doubling;
        } catch (NumberFormatException e) {
            return (new Error("Its not an integer!"));
        }
    }

    @GetMapping("/greeter")
    public Object greeter(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String title,
            HttpServletResponse response) {
        if (name == null || title == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            if  (name == null && title == null) {
                return (new Error("Please provide a name and a title!"));
            } else if (name == null) {
                return (new Error("Please provide a name!"));
            } else
                return (new Error("Please provide a title!"));
        } else {
            response.setStatus(HttpServletResponse.SC_ACCEPTED);
            return (new Greeter(name, title));
        }
    }
}
