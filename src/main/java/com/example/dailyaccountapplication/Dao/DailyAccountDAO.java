package com.example.dailyaccountapplication.Dao;

import com.example.dailyaccountapplication.db.DBConnection;
import com.example.dailyaccountapplication.model.DailyAccount;
import com.example.dailyaccountapplication.model.SingleAccount;

import java.sql.PreparedStatement;
import java.util.ArrayList;


public class DailyAccountDAO {
    private static final String SELECT_DAILY_ACCT = "SELECT * FROM ACCOUNT WHERE DATE = ?";
    private PreparedStatement stmt;

    public ArrayList<SingleAccount> getDailyAccounts(DailyAccount dailyAccount){
        try{
            stmt = DBConnection.startConnection().prepareStatement(SELECT_DAILY_ACCT);
            stmt.setString(1, String.valueOf(dailyAccount.getLocalDate()));
            stmt.executeUpdate();
        }catch(Exception e){

        }finally{

        }
        return new ArrayList<>();
    }
}
