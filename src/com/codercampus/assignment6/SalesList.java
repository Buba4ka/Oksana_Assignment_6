package com.codercampus.assignment6;

import java.time.LocalDate;

public class SalesList {

    private LocalDate date;
    private Integer salesDollars;

    public SalesList(){

    }

    public SalesList(LocalDate date, Integer amount) {
        this.date = date;
        this.salesDollars = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getSalesDollars() {
        return salesDollars;
    }

    public void setSalesDollars(Integer salesDollars) {
        this.salesDollars = salesDollars;
    }


}
