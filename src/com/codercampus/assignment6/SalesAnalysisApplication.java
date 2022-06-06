package com.codercampus.assignment6;

import com.codercampus.assignment6.service.AnalysisService;
import com.codercampus.assignment6.service.AnalysisServiceImpl;
import com.codercampus.assignment6.service.FileService;
import com.codercampus.assignment6.service.FileServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SalesAnalysisApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.CANADA);


		List<SalesList> list = new ArrayList<>();
		FileService service = new FileServiceImpl();
		service.readSalesFile("model3.csv");

		//AnalysisService service = new AnalysisServiceImpl();
		//service.salesDataMapping(list, "model3.csv" );




	}

}
