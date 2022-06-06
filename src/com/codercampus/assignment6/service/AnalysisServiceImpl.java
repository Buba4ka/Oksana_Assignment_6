package com.codercampus.assignment6.service;

import com.codercampus.assignment6.SalesList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AnalysisServiceImpl implements AnalysisService{

    @Override
    public void salesDataMapping(List<SalesList> salesData, String fileName) {

        FileService service = new FileServiceImpl();
        salesData = service.readSalesFile(fileName);

//        List<SalesList> year2017 = salesData.stream()
//                .filter(s -> s.getDate().getYear())
//                .("2017")
//                .collect(Collectors.toList());

//        List <Integer> dollars = salesData.stream().map(m -> m.getSalesDollars()).collect(Collectors.toList());
//        Integer max = dollars.stream().max(Comparator.comparing(Integer::intValue)).get();
//        boolean bestMonth = salesData.stream().allMatch(d -> d.getSalesDollars().equals(max));
//        Integer min = dollars.stream().min(Comparator.comparing(Integer::intValue)).get();
//        boolean worstMonth = salesData.stream().allMatch(d -> d.getSalesDollars().equals(min));


//        if (bestMonth) {
//            System.out.println("The best month was: " + salesData.get(salesData.indexOf(max)).getDate());
//        }
//        if (worstMonth) {
//            System.out.println("The worst month was: " + salesData.get(salesData.indexOf(min)).getDate());
//
//        }







    }


}
