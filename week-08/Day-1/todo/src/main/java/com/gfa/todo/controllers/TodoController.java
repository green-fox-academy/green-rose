package com.gfa.todo.controllers;

import com.gfa.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/","/list",""})

    public String list(Model m){
        m.addAttribute("todoList", new ArrayList<>(Arrays.asList(
                new String[]{"List", "List", "List"})));
        return "list";
    }
}
