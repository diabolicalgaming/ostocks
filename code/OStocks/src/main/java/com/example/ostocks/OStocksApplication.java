package com.example.ostocks;

import java.util.Scanner;

public class OStocksApplication {

	public static void main(String[] args) 
	{
		System.out.print("Enter a stock symbol: ");
		
		Scanner in = new Scanner(System.in);
		String stockSymbol = in.next();
		in.close();
	}
}
