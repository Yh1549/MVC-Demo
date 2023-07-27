package com.example.dailyaccountapplication.core;

public class ValidationTool {
    public static boolean inputIsNumeric(String str){
        return str.matches("\\d+(\\.\\d+)?");
    }
}
