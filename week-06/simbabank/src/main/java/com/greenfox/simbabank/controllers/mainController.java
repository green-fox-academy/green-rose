package com.greenfox.simbabank.controllers;

import com.greenfox.simbabank.models.BankAccount;
import com.greenfox.simbabank.models.BankAccounts;
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
   @GetMapping("/accounts")
   public String accounts(Model m){
      BankAccounts lionBank = new BankAccounts();
      lionBank.getBankAccountList().add(new BankAccount("Timon",1000,"meerkat"));
      lionBank.getBankAccountList().add(new BankAccount("Pumbaa",1000,"warthog"));
      lionBank.getBankAccountList().add(new BankAccount("Scar",1000,"lion", true));

      m.addAttribute("lionBank", lionBank.getBankAccountList());
      return "accounts";
   }

}
