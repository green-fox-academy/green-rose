package com.gfa.dependency.gfa.controllers;
import com.gfa.dependency.gfa.services.StudentService;
import com.gfa.dependency.uu.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GFAController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/gfa")
    public String getIndex(Model model){
        model.addAttribute("students", studentService.findAll());
        model.addAttribute("countStudents", studentService.count());
        return "gfa";
    }
    @GetMapping(value = "/gfa/list")
    public String getList(Model model){
        model.addAttribute("students", studentService.findAll());
        return "gfa-list";
    }
    @GetMapping(value = "/gfa/add")
    public String addStudent(Model model){
        return "add-form";
    }
    @PostMapping(value = "/gfa/save")
    public String addStudentHandling(@RequestParam String name, Model model){
        studentService.save(name);
        return "gfa";
    }
    @GetMapping(value = "/gfa/check")
    public String checkStudentForm(Model model){
        return "check-form";
    }

    @PostMapping(value = "/gfa/check")
    public String checkStudentHandling(@RequestParam String name, Model model){
        model.addAttribute("isStudent",studentService.isStudent(name) );
        return "check-form";
    }

}
