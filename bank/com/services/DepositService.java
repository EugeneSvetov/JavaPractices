package com.services;

import com.entities.Account;
import com.entities.Bill;

public class DepositService {
    public void deposit(Account account, int amount){
        Bill bill = account.getBill();
        System.out.println("Было у " + account.getPerson().getName() + " - " + bill.getAmount());
        bill.setAmount(bill.getAmount() + amount);
        System.out.println("Стало y " + account.getPerson().getName() + " - " + bill.getAmount());

    }
}
