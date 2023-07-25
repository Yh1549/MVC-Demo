package com.example.dailyaccountapplication.db;
import java.io.File;
import java.sql.*;
public class SQLiteJDBC {

    private static final String dbPath = "C:\\Users\\ssdrive\\IdeaProjects\\DailyAccountApplication\\appdb.db";
    private static final String initStmt = "CREATE TABLE ACCOUNT (accid varchar(10) DEFAULT NULL, INCOME VARCHAR(45) DEFAULT NULL, OUTCOME VARCHAR(45) DEFAULT NULL, BALANCE VARCHAR(45) DEFAULT NULL)";
    public static void initDb(){
        File file = new File(dbPath);
        if(!file.exists()){
            buildDBConnection(initStmt);
        }
    }
    public static void buildDBConnection(String Sql){
        Connection c = null;
        Statement stmt = null;
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:appdb.db");
            stmt = c.createStatement();
            stmt.executeUpdate(Sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            if(c != null){
                try{
                    assert stmt != null;
                    stmt.close();
                    c.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            };
        }
    }


}
