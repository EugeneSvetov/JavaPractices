package com.services;

import com.entities.Account;
import com.entities.Bill;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount){
        Bill BillFrom = accountFrom.getBill();
        Bill BIllTo = accountTo.getBill();

        if (BillFrom.getAmount() < amount){
            System.out.println("мало денег для перевода");
        }
        else {
            System.out.println("Происходит перевод денег с аккаунта " + accountFrom.getPerson().getName() + " на аккаунт " + accountTo.getPerson().getName());
            BillFrom.setAmount(BillFrom.getAmount() - amount);
            BIllTo.setAmount(BIllTo.getAmount() + amount);
            System.out.println("Платеж гатов");
            System.out.println("Теперь денег у " + accountFrom.getPerson().getName() + " - " + BillFrom.getAmount());
            System.out.println("Теперь денег у " + accountTo.getPerson().getName() + " - " + BIllTo.getAmount());
        }
    }
}
