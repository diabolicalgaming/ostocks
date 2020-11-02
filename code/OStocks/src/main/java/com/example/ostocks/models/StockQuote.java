package com.example.ostocks.models;

public class StockQuote extends Stock
{	
	private double currentPrice;
	private double high;
	private double low;
	private double open;
	private double previousClose;
	
	public StockQuote()
	{
		
	}

	public StockQuote(String ticker, String companyName, String country, String currency, String industry, String exchange, double currentPrice, double high, double low, double open, double previousClose) 
	{
		super(ticker,companyName,country,currency,industry,exchange);
		this.currentPrice = currentPrice;
		this.high = high;
		this.low = low;
		this.open = open;
		this.previousClose = previousClose;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}
}
