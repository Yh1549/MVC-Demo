package com.example.dailyaccountapplication.db;

import java.io.File;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDBService {
    private static final String initSql = "CREATE TABLE ACCOUNT (accid varchar(10) DEFAULT NULL, INCOME VARCHAR(45) DEFAULT NULL, OUTCOME VARCHAR(45) DEFAULT NULL, BALANCE VARCHAR(45) DEFAULT NULL)";
    private static Statement stmt = null;

    public static void initDB() {
        File file = new File(DBConnection.DB_ADDR);
        if(!file.exists()){
            try {
                stmt = DBConnection.startConnection().createStatement();
                stmt.executeUpdate(initSql);
            } catch (SQLException e) {
                System.out.print("initialize failed");
            }finally {
                try{
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }else{
            System.out.print("database already exist");
        }
    }
}