package com.greenfox.simbabank.models;

import java.util.ArrayList;
import java.util.List;


public class BankAccounts {
   private List<BankAccount> bankAccountList;
   public BankAccounts(){
       this.bankAccountList = new ArrayList<>();
       this.bankAccountList.add(new BankAccount());
   }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
}
