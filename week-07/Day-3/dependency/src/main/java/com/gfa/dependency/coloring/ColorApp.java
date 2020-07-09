package com.gfa.dependency.coloring;

import com.gfa.dependency.helloworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gfa.dependency.coloring","com.gfa.dependency.helloworld"})

public class ColorApp implements CommandLineRunner {

    private MyColor color;
    public ColorApp(MyColor myColor){
        this.color=myColor;
    }

    @Override
    public void run(String... args) throws Exception {
        color.printColor();
    }
    public static void main(String[] args) {
        SpringApplication.run(ColorApp.class, args);
    }

}
