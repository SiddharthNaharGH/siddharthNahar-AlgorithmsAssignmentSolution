package com.greatlearning.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.greatlearning.model.Company;
import com.greatlearning.service.StockOperations;

public class Driver {

	public static void main(String[] args) {
		
		List<Company> companies = new ArrayList<Company>();
		Company company = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====================Welcome to Stockers===================");
		System.out.println("Please enter the number of companies to be listed");
		
		int noOfCompanies = 0;
		
		noOfCompanies = scan.nextInt();
		
		for(int i=0;i<noOfCompanies;i++)
		{
			System.out.println("Enter current stock price of the company "+(i+1)+": ");
			double stockPrice = scan.nextDouble();
			System.out.println("Please tell whether the company's stock price rose today compared to yesterday ? ");
			String isStockChanged = scan.next();
			company = new Company(stockPrice,isStockChanged);
			companies.add(company);
		}
		
		System.out.println("Thank you for your input. We have added "+noOfCompanies+" companies in our system.");
		System.out.println("Do you wish to proceed ? Y/N");
		String proceed = scan.next();
		if("N".equalsIgnoreCase(proceed))
		{
			System.out.println("Thank you for using Stockers. Please visit again !!");
			System.exit(0);
		}
		while(proceed.equalsIgnoreCase("Y")){
		System.out.println("Enter the operation that you want to perform from below list:");
		System.out.println("1. Display the companies stock prices in ascending order.");
		System.out.println("2. Display the companies stock prices in descending order.");
		System.out.println("3. Display the total no of companies for which stock prices rose today.");
		System.out.println("4. Display the total no of companies for which stock prices declined today.");
		System.out.println("5. Search a specifc stock price.");
		System.out.println("6. Press 0 to Exit.");
		
		int choice = scan.nextInt();
		
		StockOperations operation = new StockOperations();
		
		switch(choice)
		{
			case 0:
				System.out.println("Thank you for using Stockers. Please visit again !!");
				System.exit(0);
		
			case 1: 
				operation.ascendingStocks(companies);
				break;
			
			case 2: 
				operation.descendingStocks(companies);
				break;
			
			case 3:
				int increasedCount = operation.increasedStockPriceCompanies(companies);
				System.out.println("Total no. of companies whose stock price rose today is: "+increasedCount);
				break;
			
			case 4:
				int declinedCount = operation.decreasedStockPriceCompanies(companies);
				System.out.println("Total no. of companies whose stock price declined today is: "+declinedCount);
				break;
			
			case 5: 
				System.out.println("Enter the stock price: ");
				double stockValue = scan.nextDouble();
				boolean isStockPresent = operation.searchStock(companies, stockValue);
				if(isStockPresent)
				{
					System.out.println("Stock of value "+stockValue+" is present.");
				}
				else
				{
					System.out.println("Stock of value "+stockValue+" is not present.");
				}
				break;
			
			default:
				System.out.println("You have entered an invalid input.");
				return;
		}
		
		System.out.println("Do you wish to continue? Y/N");
			
			proceed = scan.next();
			
		}
	}
		
}
