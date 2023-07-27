package com.example.dailyaccountapplication.Dao;

import com.example.dailyaccountapplication.db.DBConnection;
import com.example.dailyaccountapplication.model.SingleAccount;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SingleAccountDAO {
    private static final String INSERT_ACCT = "INSERT INTO ACCOUNT(INCOME,OUTCOME,BALANCE) VALUES(?,?,?)";
    private PreparedStatement stmt;

    //    private Connection con = DBConnection.startConnection();
    public void saveAccount(SingleAccount newAcct) {
        try {
            stmt = DBConnection.startConnection().prepareStatement(INSERT_ACCT);
            stmt.setString(1, String.valueOf(newAcct.getIncome()));
            stmt.setString(2, String.valueOf(newAcct.getOutcome()));
            stmt.setString(3, String.valueOf(newAcct.getBalance()));
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.print("update failed");
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                System.out.print("close failed");
            }
        }
    }
}
