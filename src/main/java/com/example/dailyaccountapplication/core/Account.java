package com.example.dailyaccountapplication.core;

import java.time.LocalDate;

public interface Account {
    //default for single account
    default double balanceCalculate(double in, double out){
       return in - out;
     };


}
