package com.stoxs.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stoxs.ApiKeys;
import com.stoxs.Entities.GuardianNews;

public class StoxsImpl {

	public String getQuynh() {
		return "Hi Quynh";
	}

	public String getGuardianNews(String searchTerm) {

		StringBuilder builder = new StringBuilder();

		try {

			URL url = new URL("http://content.guardianapis.com/search?q="
					+ searchTerm + "&api-key=" + ApiKeys.GuardianKey);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				builder.append(output);
				System.out.println(output);
			}

			conn.disconnect();
			

			String news = builder.toString();
			
			ObjectMapper mapper = new ObjectMapper();
			GuardianNews guardianNews = mapper.readValue(news, GuardianNews.class);

			return guardianNews.toString();
		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return "";
	}
}
