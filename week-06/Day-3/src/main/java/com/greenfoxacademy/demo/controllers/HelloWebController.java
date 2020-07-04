package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class HelloWebController {

    //@ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    //@GetMapping("/hello")

    public String hello(@RequestParam(name="name", required=false, defaultValue="Mila") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
