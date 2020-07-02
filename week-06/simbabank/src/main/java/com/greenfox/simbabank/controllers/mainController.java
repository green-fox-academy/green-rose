package com.greenfox.simbabank.controllers;

import com.greenfox.simbabank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

   @GetMapping("/show")
    public String show(Model m){
       BankAccount simbaAccount = new BankAccount();

       m.addAttribute("account", simbaAccount);
       return "show";
   }
   @GetMapping("/")
   public String html(Model m){
      String sentence = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

      m.addAttribute("sentence", sentence);
      return "index";
   }

}
