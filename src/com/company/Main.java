package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static class Account{

        private int id = 0;

        private double balance = 0;

        private double annualInterestRate = 0;

        private Date dateCreated = new Date();

        public Account(){

        }

        public Account(int id , double balance){

            this.id = id;
            this.balance = balance;

        }

        public int getId() {
            return this.id;
        }

        public double getBalance() {
            return this.balance;
        }

        public Date getDateCreated() {
            return this.dateCreated;
        }

        public double getAnnualInterestRate() {
            return this.annualInterestRate;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public void setDateCreated() {
            Date dateCreated = new Date();
            this.dateCreated = dateCreated;
        }

        public double getMonthlyInterestRate() {
            return (this.annualInterestRate / 100) / 12;
        }

        public double getMonthlyInterest() {
            return this.balance * this.getMonthlyInterestRate();
        }

        public void withdraw(double money) {
            this.balance -= money;
        }

        public void deposit(double money) {
            this.balance += money;
        }


    }

}
