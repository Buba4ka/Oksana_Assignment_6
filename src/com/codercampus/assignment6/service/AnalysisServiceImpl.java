package com.codercampus.assignment6.service;

import com.codercampus.assignment6.SalesList;
import java.util.*;

public class AnalysisServiceImpl implements AnalysisService{

    @Override
    public void salesDataMapping(List<SalesList> salesData, String fileName) {

        FileService service = new FileServiceImpl();
        salesData = service.readSalesFile(fileName);


        Integer max = salesData.stream().map(s -> s.getQuantity()).max(Integer::compare).get();
        Integer min = salesData.stream().map(s -> s.getQuantity()).min(Integer::compare).get();

        String [] model = fileName.split("\\.");

        System.out.println(model[0].substring(0,1).toUpperCase() + model[0].substring(1) + " Yearly Sales Report \n" +
                                  "-----------------------------");

        salesCount(salesData);

        for (SalesList s: salesData) {
            if (s.getQuantity().equals(max)) {
                System.out.println("The best month for " + model[0] + " was: " + s.getDate());
            } else if (s.getQuantity().equals(min)) {
                System.out.println("The worst month for " + model[0] + " was: " + s.getDate());
            }
        }

    }
    @Override
    public void salesCount(List<SalesList> salesData) {

        Integer year = 0;
        List<Integer> years = new ArrayList<>();

        for (SalesList s: salesData) {
            year = s.getDate().getYear();

            if (!years.contains(year)) {
                years.add(year);
            }

        }

        for (Integer n: years) {
            Integer sales = salesData.stream().filter(y -> y.getDate().getYear() == n).mapToInt(a -> a.getQuantity()).sum();

            System.out.println(n + " -> " + sales);
        }

    }


}
