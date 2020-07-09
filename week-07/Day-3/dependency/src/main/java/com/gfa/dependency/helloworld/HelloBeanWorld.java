package com.gfa.dependency.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorld implements CommandLineRunner {

    @Autowired
    private Printer printer;

    @Override
    public void run(String... args) throws Exception {
        //printer.log("Hello");
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloBeanWorld.class, args);
    }

}
