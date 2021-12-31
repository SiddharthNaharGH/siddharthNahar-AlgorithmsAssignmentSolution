package com.greatlearning.service;

import java.util.Comparator;

import com.greatlearning.model.Company;

public class StockComparator implements Comparator<Company> {

	@Override
	public int compare(Company company1, Company company2) {
		// TODO Auto-generated method stub
		
		if(company1.getStockPrice() == company2.getStockPrice())
		{
			return 0;
		}
		else if (company1.getStockPrice() < company2.getStockPrice())
		{
			return -1;
		}
		else
			return 1;
	}

	
}
