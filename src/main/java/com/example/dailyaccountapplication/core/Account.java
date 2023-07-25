package com.example.dailyaccountapplication.core;

import java.time.LocalDate;

public class Account {
    private double income = 0;
    private double outcome = 0;
    private double balance;
    private LocalDate recordDateTime;


    public Account(double i, double o){
        this.income = i;
        this.outcome = o;
        balanceCalculate();
    }
    public void setIncome(double income) {
        this.income = income;
        balanceCalculate();
    }

    public double getIncome() {
        return income;
    }

    private void balanceCalculate(){
        this.balance = this.income - this.outcome;
     };

    public double getBalance() {
        return balance;
    }
}
