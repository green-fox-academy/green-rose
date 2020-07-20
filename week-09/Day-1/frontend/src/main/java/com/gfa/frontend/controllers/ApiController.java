package com.gfa.frontend.controllers;

import models.*;

import models.Appendable;
import models.Error;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/dountil/{action}")
    public Object sumDoUntil(@RequestBody (required = false)Action na, HttpServletResponse response, @PathVariable String action) {
        if (na!=null) {
            switch (action) {
                case "sum":
                    response.setStatus(HttpServletResponse.SC_OK);
                    return na.sum();
                case "factor":
                    response.setStatus(HttpServletResponse.SC_OK);
                    return na.factor();
                default:
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    return (new Error("Wrong operation!"));
            }
        } else  {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return (new Error("Missing json"));
        }
    }
}
