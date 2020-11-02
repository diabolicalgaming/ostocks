package com.example.ostocks.models;

public class Stock 
{
	private String ticker;
	private String companyName;
	private String country;
	private String currency;
	private String industry;
	private String exchange;
	
	public Stock()
	{
		
	}

	public Stock(String ticker, String companyName, String country, String currency, String industry, String exchange) 
	{
		this.ticker = ticker;
		this.companyName = companyName;
		this.country = country;
		this.currency = currency;
		this.industry = industry;
		this.exchange = exchange;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
}
