package com.gfa.frontend.controllers;

import com.gfa.frontend.models.*;
import com.gfa.frontend.services.*;
import com.gfa.frontend.models.Appendable;
import com.gfa.frontend.models.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;

@RestController
public class ApiController {

    public ApiController(LogService logService) {
    }

    @Autowired
    LogService logService;

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(required = false) String input) {
        this.logService.save(new Log("/doubling", Collections.singletonMap("input", input).toString()));
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
            this.logService.save(new Log(
                    "/greeter",
                    Collections.singletonMap("name", name).toString()+" , "+Collections.singletonMap("title", title).toString()));
            response.setStatus(HttpServletResponse.SC_OK);
            return (new Greeter(name, title));
        }
    }

    @GetMapping("/appenda/{appendable}")
    public Object appenda(@PathVariable(required = false) String appendable,  HttpServletResponse response) {
        this.logService.save(new Log(
                "/appenda",
                Collections.singletonMap("name", appendable).toString()));
        response.setStatus(HttpServletResponse.SC_OK);
        return (new Appendable(appendable));
    }

    @GetMapping("/appenda")
    public Object appendaWOAppendable(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return (new Error("Please provide appendable!"));
    }

  @PostMapping("/dountil/{action}")
    public Object sumDoUntil(@RequestBody (required = false) Action na, HttpServletResponse response, @PathVariable String action) {
        if (na!=null) {
            switch (action) {
                case "sum":
                    this.logService.save(new Log(
                            "/appenda/sum",
                            na.toString()));
                    response.setStatus(HttpServletResponse.SC_OK);
                    return na.sum();
                case "factor":
                    this.logService.save(new Log(
                            "/appenda/factor",
                            na.toString()));
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
    @PostMapping("/arrays")
    public Object arrays(@RequestBody (required = false) NumbersHandling nh, HttpServletResponse response) {
        if (nh==null) {
            return (new Error("Missing json"));
        } else {
            this.logService.save(new Log(
                    "/arrays",
                    nh.toString()));
            return nh.runHandling(response);
        }
    }

    @PostMapping("/sith")
    public ResponseEntity<?> sith(@RequestBody (required = false) Sith sith, HttpServletResponse response) {
        if (sith==null || sith.getText()=="") {
            return new ResponseEntity<>(new Error("Feed me some text you have to, padawan young you are. Hmmm."), HttpStatus.NOT_FOUND);
        } else {

            return  new ResponseEntity<>(sith, HttpStatus.OK);
        }
    }
}
