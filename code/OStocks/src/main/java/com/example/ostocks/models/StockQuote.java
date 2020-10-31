package com.example.ostocks.models;

public class StockQuote extends Stock
{	
	private double previousClose;
	private double open;
	private double bid;
	private double ask;
	private double beta;
	private double peRatio;
	private double eps;
	private double change;
	private double volume;
	
	public StockQuote()
	{
		
	}

	public StockQuote(String ticker, String company, String sector, String country, double currentPrice, double previousClose, double open, double bid, double ask, double beta, double peRatio, double eps, double change, double volume) 
	{
		super(ticker, company, sector, country, currentPrice);
		this.previousClose = previousClose;
		this.open = open;
		this.bid = bid;
		this.ask = ask;
		this.beta = beta;
		this.peRatio = peRatio;
		this.eps = eps;
		this.change = change;
		this.volume = volume;
	}

	public double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getBid() {
		return bid;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}

	public double getAsk() {
		return ask;
	}

	public void setAsk(double ask) {
		this.ask = ask;
	}

	public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public double getPeRatio() {
		return peRatio;
	}

	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}

	public double getEps() {
		return eps;
	}

	public void setEps(double eps) {
		this.eps = eps;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}
