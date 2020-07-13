package com.gfa.todo;
import org.springframework.boot.CommandLineRunner;
import com.gfa.todo.models.Todo;
import com.gfa.todo.repositories.TodoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoApplication{

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Bean
    public CommandLineRunner save(TodoRepository todoRepository){

       return (args) ->    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));

    }

    }
