package com.gfa.dependency.uu.controllers;
import com.gfa.dependency.uu.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilController {
    @Autowired
    private UtilityService utilityService;

    @GetMapping(value = "/useful")
    public String getIndex(Model model){
        return "useful";
    }

    @GetMapping(value = "/useful/colored")
    public String randomColor(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping(value = "/useful/email")
    public String emailValidator(@RequestParam("email") String email, Model model){
        model.addAttribute("isValid", utilityService.isValidEmail(email));
        model.addAttribute("email", email);

        return "email";
    }

    @GetMapping(value = "/useful/encoder")
    public String encodeCezar(@RequestParam("text") String text, @RequestParam("number") Integer number, Model model){
        model.addAttribute("text", utilityService.caesar(text,number));
        return "cezar";
    }

    @GetMapping(value = "/useful/decoder")
    public String decodeCezar(@RequestParam("text") String text, @RequestParam("number") Integer number, Model model){
        model.addAttribute("text", utilityService.caesar(text,-number));
        return "cezar";
    }
}
