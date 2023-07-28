package com.example.dailyaccountapplication.model;

import com.example.dailyaccountapplication.core.Account;

import java.time.LocalDate;
import java.util.ArrayList;

//model for daily calculate
public class DailyAccount implements Account {
    private double dailyIncome = 0;
    private double dailyOutcome = 0;
    private double dailyBalance = 0;
    private LocalDate localDate;
    private ArrayList<SingleAccount> singleAccounts;

    public DailyAccount(){
        this.singleAccounts = new ArrayList<>();
        this.localDate = LocalDate.now();
    }
    public DailyAccount(ArrayList<SingleAccount> list){
        this.singleAccounts = list;
        this.localDate = LocalDate.now();
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
    public LocalDate getLocalDate(){
        return this.localDate;
    }
}