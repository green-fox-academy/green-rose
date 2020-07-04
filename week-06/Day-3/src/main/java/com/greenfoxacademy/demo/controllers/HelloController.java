package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController


    public class HelloController {

        public AtomicInteger counter = new AtomicInteger();

        @ResponseBody
        //@RequestMapping(value = "/hello", method = RequestMethod.GET)
        @GetMapping("/")

        public String  hello(@RequestParam(name="name", required=false, defaultValue="Mila") String name) {

            Greeting greet = new Greeting(counter.incrementAndGet(),"Hello, "+name);
            return greet.toString();
        }
    }

