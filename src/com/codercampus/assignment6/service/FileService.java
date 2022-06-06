package com.codercampus.assignment6.service;

import com.codercampus.assignment6.SalesList;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface FileService {
	
	List<SalesList> readSalesFile (String fileName);

}
