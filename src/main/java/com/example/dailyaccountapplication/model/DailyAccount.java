package com.example.dailyaccountapplication.model;

import com.example.dailyaccountapplication.core.Account;

import java.util.ArrayList;

//model for daily calculate
public class DailyAccount implements Account {
    private double dailyIncome = 0;
    private double dailyOutcome = 0;
    private double dailyBalance = 0;
    private ArrayList<SingleAccount> singleAccounts = new ArrayList<>();

    public DailyAccount(){
            //select localDate account
    }

    public void addAcct(SingleAccount acct) {
        singleAccounts.add(acct);
        this.dailyIncome += singleAccounts.get(singleAccounts.size() - 1).getIncome();
        this.dailyOutcome += singleAccounts.get(singleAccounts.size() - 1).getOutcome();
        this.dailyBalance = balanceCalculate(this.dailyIncome, this.dailyOutcome);
    }

    public ArrayList<SingleAccount> getSingleAccounts() {
        return this.singleAccounts;
    }

    public double getDailyBalance() {
        return dailyBalance;
    }

    public double getDailyIncome() {
        return dailyIncome;
    }

    public double getDailyOutcome() {
        return dailyOutcome;
    }
}