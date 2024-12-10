package com.example.demo;

import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named("dateBean")

public class DateBean implements Serializable {
    private Date currentDate;

    public DateBean() {
        this.currentDate = new Date();
    }

    public Date getCurrentDate() {
        return this.currentDate;
    }

    public void refreshDate() {
        this.currentDate = new Date();
    }
}
