package com.codercampus.assignment6;

import com.codercampus.assignment6.service.AnalysisService;
import com.codercampus.assignment6.service.AnalysisServiceImpl;
import java.util.ArrayList;
import java.util.List;


public class SalesAnalysisApplication {

	public static void main(String[] args) {


		List<SalesList> list = new ArrayList<>();

		AnalysisService service = new AnalysisServiceImpl();

		service.salesDataMapping(list, "model3.csv" );

		service.salesDataMapping(list, "modelS.csv");
		
		service.salesDataMapping(list, "modelX.csv");




	}

}
