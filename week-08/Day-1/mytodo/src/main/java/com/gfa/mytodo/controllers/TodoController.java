package com.gfa.mytodo.controllers;

import com.gfa.mytodo.models.Assignee;
import com.gfa.mytodo.models.Todo;
import com.gfa.mytodo.repositories.AssigneeRepository;
import com.gfa.mytodo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository todoRepository;
    AssigneeRepository assigneeRepository;

    public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
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
        m.addAttribute("assignees",this.assigneeRepository.findAll());
        return "add-form";
    }

    @PostMapping("add")
    public String addFormHandling(@ModelAttribute Todo todo, @RequestParam Long assignee_id){
        todo.setAssignee(this.assigneeRepository.findById(assignee_id).orElse(null));
        this.todoRepository.save(todo);
        return  "redirect:/todo/list";
    }

    @GetMapping("{id}/delete")
    public String delete(@PathVariable Long id){
        this.todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("{id}/edit")
    public String editForm(@PathVariable Long id, Model m){
        m.addAttribute("todo", this.todoRepository.findById(id).get());
        m.addAttribute("assignees",this.assigneeRepository.findAll());
        return "edit-form";
    }

    @PostMapping("{id}/edit")
    public String editHandling(@ModelAttribute Todo todo, @RequestParam Long assignee_id){
        todo.setAssignee(this.assigneeRepository.findById(assignee_id).orElse(null));
        this.todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @PostMapping("/search_result")
    public String searchItem(@RequestParam String search, Model m){
        m.addAttribute("shop",this.todoRepository.findByTitleOrContentOrDescriptionContaining(search,search,search));
        return "list";
    }

    @GetMapping(value = {"/assignees"})
    public String assignees(Model m){
        m.addAttribute("assignees",this.assigneeRepository.findAll());
        return "assignees";
    }

    @GetMapping("/assignee/{id}/delete")
    public String deleteAssignee(@PathVariable Long id){
        this.assigneeRepository.deleteById(id);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/assignee/{id}/edit")
    public String editAssigneeForm(@PathVariable Long id, Model m){
        m.addAttribute("assignee",this.assigneeRepository.findById(id).orElse(null));
        return "edit-assignee";
    }

    @PostMapping("/assignee/{id}/edit")
    public String editAssigneeHandling(@ModelAttribute Assignee assignee){
        this.assigneeRepository.save(assignee);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/assignee/add")
    public String addAssigneeForm(){
        return "add-assignee";
    }

    @PostMapping("/assignee/add")
    public String addAssigneeHandling(@ModelAttribute Assignee assignee){
        this.assigneeRepository.save(assignee);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/assignee/{id}/list")
    public String listAssigneeToDo(@PathVariable Long id, Model m){
        m.addAttribute("toDoes",this.todoRepository.findByAssignee_Id(id));
        return "edit-assignee";
    }
}
