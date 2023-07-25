package com.example.dailyaccountapplication.controller;

import com.example.dailyaccountapplication.core.Account;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HomeController {
    @FXML
    private TextField incomeInput;
    @FXML
    private Label balance;
    @FXML
    private Label income;
    @FXML
    private Label outcome;
    @FXML
    private TextField outcomeInput;

    public void saveSingleAccount(){
        double incomeValue = Double.parseDouble(incomeInput.getText());
        double outcomeValue = Double.parseDouble(outcomeInput.getText());
        Account account = new Account(incomeValue, outcomeValue);
        income.setText(incomeInput.getText());
        outcome.setText(outcomeInput.getText());
        balance.setText(String.valueOf(account.getBalance()));
        
    }
}
