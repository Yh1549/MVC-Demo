package com.example.dailyaccountapplication.controller;

import com.example.dailyaccountapplication.Dao.SingleAccountDAO;
import com.example.dailyaccountapplication.core.Account;
import com.example.dailyaccountapplication.core.ValidationTool;
import com.example.dailyaccountapplication.model.DailyAccount;
import com.example.dailyaccountapplication.model.SingleAccount;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HomeController {
    @FXML
    private TextField incomeInput;
    @FXML
    private TextField outcomeInput;
    @FXML
    private Label balance;
    @FXML
    private Label income;
    @FXML
    private Label outcome;
    @FXML
    private Label dailyAccount;

    private SingleAccountDAO singleAccountDAO;
    private SingleAccount newAcct;
    private DailyAccount dailyAcct = new DailyAccount();;
//    private SingleAccountDAO singleAccountDAO;


    public void saveSingleAccount() {
        if (ValidationTool.inputIsNumeric(incomeInput.getText()) && ValidationTool.inputIsNumeric(outcomeInput.getText())) {
            double incomeValue = Double.parseDouble(incomeInput.getText());
            double outcomeValue = Double.parseDouble(outcomeInput.getText());
            newAcct = new SingleAccount(incomeValue, outcomeValue);
            dailyAcct.addAcct(newAcct);

//            income.setText(incomeInput.getText());
//            outcome.setText(outcomeInput.getText());
//            balance.setText(newAcct.getBalance());
            dailyAccount.setText(String.valueOf(dailyAcct.getDailyBalance()));
//            SingleAccountDAO.saveAccount(newAcct);
            singleAccountDAO = new SingleAccountDAO();
            singleAccountDAO.saveAccount(newAcct);
        } else {
            income.setText("錯誤填寫");
        }
    }
}
