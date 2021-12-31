package com.greatlearning.service;

import java.util.Collections;
import java.util.List;

import com.greatlearning.model.Company;


public class StockOperations {

	public void ascendingStocks(List<Company> companies)
	{
		Collections.sort(companies,new StockComparator());
		System.out.println("Stock prices in ascending order are:");
		for (Company company : companies) {
			
			System.out.println(company.getStockPrice()+" ");
		}
	}
	
	public void descendingStocks(List<Company> companies)
	{
		Collections.sort(companies,new StockComparator());
		System.out.println("Stock prices in descending order are:");
		for(int i = companies.size()-1;i>=0;i--) {
			
			System.out.println(companies.get(i).getStockPrice()+" ");
		}
	}
	
	public int increasedStockPriceCompanies(List<Company> companies)
	{
		int companyCount = 0;
		
		for (Company company : companies) {
			if("true".equalsIgnoreCase(company.getIsPriceIncreased()))
			{
				companyCount++;
			}
		}
		
		return companyCount;
	}
	
	public int decreasedStockPriceCompanies(List<Company> companies)
	{
		int companyCount = 0;
		
		for (Company company : companies) {
			if("false".equalsIgnoreCase(company.getIsPriceIncreased()))
			{
				companyCount++;
			}
		}
		
		return companyCount;
	}
	
	public boolean searchStock(List<Company> companies,double stockValue)
	{
		for (Company company : companies) {
			if(company.getStockPrice()==stockValue)
			{
				return true;
			}
		}
		return false;
	}
}
