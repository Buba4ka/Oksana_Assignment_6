package com.codercampus.assignment6.service;

import com.codercampus.assignment6.SalesList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AnalysisService {


    void salesDataMapping (List<SalesList> salesData, String fileName);


}
