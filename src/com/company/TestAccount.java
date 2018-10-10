package com.company;

import java.util.Date;

public class TestAccount {

    public static void main(String[] args) {
        Main.Account account = new Main.Account();

        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);
        account.setDateCreated();
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Id: " + account.getId());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Date: " + account.getDateCreated());
        System.out.println("MonthlyInterest: " + account.getMonthlyInterest());
    }

}
