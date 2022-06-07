package com.codercampus.assignment6;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class SalesList {

    private YearMonth date;
    private Integer quantity;


    public SalesList(YearMonth date, Integer quantity) {
        this.date = date;
        this.quantity = quantity;
    }

    public YearMonth getDate() {
        return date;
    }

    public void setDate(YearMonth date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
