package com.example.dailyaccountapplication.model;

import com.example.dailyaccountapplication.core.Account;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingleAccount implements Account {
    private double income;
    private double outcome;
    private double balance;
    private LocalDateTime localDateTime = LocalDateTime.now();

    public SingleAccount(double in, double out) {
        this.income = in;
        this.outcome = out;
        this.balance = balanceCalculate(in, out);
    }

    public void setIncome(double income) {
        this.income = income;

    }
    public double getIncome() {
        return this.income;
    }
    public void setOutcome(double outcome) {
        this.outcome = outcome;
    }

    public double getOutcome() {
        return this.outcome;
    }


    public String getBalance() {
        return String.valueOf(balance);
    }

    public LocalDateTime getLocalDate() {
        return localDateTime;
    }
}
