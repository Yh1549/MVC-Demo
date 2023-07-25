package com.example.dailyaccountapplication.db;

import java.sql.SQLException;
import java.sql.Statement;

public class InitDBService {
    private static Statement stmt;
    private static final String initSql = "CREATE TABLE ACCOUNT (accid varchar(45),) ";

    public static void initDB() {
        try {
            stmt = DBConnection.startConnection().createStatement();
            stmt.executeUpdate(initSql);
        } catch (SQLException e) {

        }finally {
            try{
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        SQLiteJDBC.buildDBConnection(initSql);
    }
}