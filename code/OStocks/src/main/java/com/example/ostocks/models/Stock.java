package com.example.ostocks.models;

public class Stock 
{
	private String ticker;
	private String company;
	private String sector;
	private String country;
	private double currentPrice;
	
	public Stock()
	{
		
	}

	public Stock(String ticker, String company, String sector, String country, double currentPrice) 
	{
		this.ticker = ticker;
		this.company = company;
		this.sector = sector;
		this.country = country;
		this.currentPrice = currentPrice;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
}
