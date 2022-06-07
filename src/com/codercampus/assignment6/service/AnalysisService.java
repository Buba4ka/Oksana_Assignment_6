package com.codercampus.assignment6.service;

import com.codercampus.assignment6.SalesList;
import java.util.List;


public interface AnalysisService {


    void salesDataMapping (List<SalesList> salesData, String fileName);
    void salesCount (List<SalesList> salesData);


}
