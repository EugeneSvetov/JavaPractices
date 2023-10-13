package com.services;

import com.entities.Account;
import com.entities.Bill;

public class PaymentService {
    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if (bill.getAmount() < amount){
            System.out.println("нет денег");
        }
        else {
            System.out.println("Было y " + account.getPerson().getName() + " - " + bill.getAmount());
            bill.setAmount(bill.getAmount() - amount);
            System.out.println("Стало y " + account.getPerson().getName() + " - " + bill.getAmount());
        }

    }
}
