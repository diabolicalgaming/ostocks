package com.example.ostocks.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.List;
import java.util.Map;

public class FinnhubAPI 
{
	public static String getAPICredentials() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("src/main/resources/application.properties"));
		
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty("apiKey");
	}
	
	//quote example: https://finnhub.io/api/v1/quote?symbol=AAPL&token=bug2u3v48v6qf6lc3d8g
	
	public static void getApiClient(String ticker) throws IOException, InterruptedException
	{
		List<String> urls = new ArrayList<>();
		urls.add("https://finnhub.io/api/v1/stock/profile2?symbol="); urls.add("https://finnhub.io/api/v1/quote?symbol=");
		
		Map<String, String> data = new HashMap<>();
		data.put("stock",""); data.put("quote",""); 
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.header("accept", "application/json")
				.uri(URI.create("https://finnhub.io/api/v1/stock/profile2?symbol="+ ticker + "&token="+getAPICredentials()))
				.build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		getApiClient("AAPL");
		String homePath = System.getProperty("user.home");
		new File(homePath + "/Desktop/TEMP").mkdir();
		
		File file = new File(homePath + "/Desktop/TEMP/StockQuote.json");
		file.getParentFile().mkdir();
		file.createNewFile();
	}
}
