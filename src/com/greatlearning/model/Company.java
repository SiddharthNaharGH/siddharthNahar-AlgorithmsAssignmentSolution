package com.greatlearning.model;

public class Company {

	double stockPrice;
	String isPriceIncreased;
	
	public Company(double stockPrice,String isPriceIncreased)
	{
		this.stockPrice = stockPrice;
		this.isPriceIncreased = isPriceIncreased;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getIsPriceIncreased() {
		return isPriceIncreased;
	}

	public void setPriceIncreased(String isPriceIncreased) {
		this.isPriceIncreased = isPriceIncreased;
	}
	
	
	
}
