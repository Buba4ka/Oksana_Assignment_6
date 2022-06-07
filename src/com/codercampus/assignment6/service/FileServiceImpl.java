package com.codercampus.assignment6.service;

import com.codercampus.assignment6.SalesList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FileServiceImpl implements FileService {

	@Override
	public List<SalesList> readSalesFile(String fileName) {
		List<SalesList> fileContent = new ArrayList<>();


		BufferedReader fileReader = null;
		
		try { 
			fileReader = new BufferedReader(new FileReader(fileName));


			String header = fileReader.readLine();
			int index =0;
			String raw = "";
			while ((raw = fileReader.readLine()) != null) {
				String [] data = raw.split(",");
				String d = data[0];
				//d= d+ "-01";


				//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-yy-dd", Locale.US);
				YearMonth date = YearMonth.parse(d, DateTimeFormatter.ofPattern("MMM-yy"));
				//LocalDate date = LocalDate.parse(d,formatter);
				Integer count =  Integer.valueOf(data[1]);
				SalesList salesList = new SalesList(date,count);
				fileContent.add(index,salesList);
				index++;


			}

		} catch (FileNotFoundException e) {
			System.out.println("There is no file with such name.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				assert fileReader != null;
				fileReader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

		//fileContent.stream().forEach(s -> System.out.println(s.getQuantity()));

		return fileContent;
	}

}
