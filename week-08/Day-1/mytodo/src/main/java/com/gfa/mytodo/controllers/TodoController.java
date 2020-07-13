package com.gfa.mytodo.controllers;

import com.gfa.mytodo.models.Todo;
import com.gfa.mytodo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/","/list",""})

    public String list(@RequestParam(required = false) boolean isActive, Model m){
        if (isActive == true) {
            m.addAttribute("todoList",this.todoRepository.findByDone(false));
        } else m.addAttribute("todoList",this.todoRepository.findAll());
        return "list";
    }


    @GetMapping("add")
    public String addForm(Model m){
        return "add-form";
    }

    @PostMapping("add")
    public String addFormHandling(@ModelAttribute Todo todo, Model m){
        this.todoRepository.save(todo);
        return  "redirect:/todo/list";
    }
}
