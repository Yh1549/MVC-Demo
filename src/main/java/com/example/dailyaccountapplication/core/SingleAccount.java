package com.example.dailyaccountapplication.core;

import java.time.LocalDate;

public class SingleAccount extends Account{
    private LocalDate recordDateTime;

    public SingleAccount(LocalDate recordDateTime) {
        super(0.0,0.0);
        this.recordDateTime = recordDateTime;
    }
}
