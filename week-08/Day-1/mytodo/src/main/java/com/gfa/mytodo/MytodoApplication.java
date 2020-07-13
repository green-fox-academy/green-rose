package com.gfa.mytodo;

import com.gfa.mytodo.models.Todo;
import com.gfa.mytodo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MytodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytodoApplication.class, args);
    }



}
