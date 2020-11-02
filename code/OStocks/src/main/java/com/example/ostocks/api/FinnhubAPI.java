package com.example.ostocks.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
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
	
	public static void getMapApiClient(String ticker) throws IOException, InterruptedException
	{
		String[] urlToData = {"https://finnhub.io/api/v1/stock/profile2?symbol=", "https://finnhub.io/api/v1/quote?symbol="};
		
		Map<String, String> data = new HashMap<>();
		data.put("stock",""); data.put("quote",""); 
		
		HttpClient client = HttpClient.newHttpClient();
		
		for(int i = 0; i < urlToData.length; i++)
		{
			HttpRequest request = HttpRequest.newBuilder()
					.GET()
					.header("accept", "application/json")
					.uri(URI.create(urlToData[i] + ticker + "&token="+getAPICredentials()))
					.build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			urlToData[i] = response.body();
		}
		
		data.put("stock", urlToData[0]); data.put("quote", urlToData[1]);
		
		System.out.println(data);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		getMapApiClient("AMD");
		String homePath = System.getProperty("user.home");
		new File(homePath + "/Desktop/TEMP").mkdir();
		
		File file = new File(homePath + "/Desktop/TEMP/StockQuote.json");
		file.getParentFile().mkdir();
		file.createNewFile();
	}
}
