package com.gfa.frontend.controllers;

import models.Doubling;
import models.Error;
import models.Greeter;
import models.Appendable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ApiController {
    @GetMapping("/doubling")
    public Object doubling(@RequestParam(required = false) String input) {
        if (input == null) return (new Error());
        try {
            Integer.parseInt(input);
            Doubling doubling = new Doubling(Integer.parseInt(input));
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
            response.setStatus(HttpServletResponse.SC_OK);
            return (new Greeter(name, title));
        }
    }

    @GetMapping("/appenda/{appendable}")
    public Object appenda(@PathVariable(required = false) String appendable,  HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_OK);
        return (new Appendable(appendable));
    }

    @GetMapping("/appenda")
    public Object appendaWOAppendable(HttpServletResponse response) {

        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return (new Error("Please provide appendable!"));

    }
}
