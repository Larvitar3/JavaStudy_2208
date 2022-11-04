package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainTest3 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://yts.mx/api/v2/list_movies.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.connect();

			int statusCode = connection.getResponseCode();

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			System.out.println(statusCode);

			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
			} 
			
			String str = sb.toString();
			System.out.println(str);
			
			
			Gson gson = new Gson();
			
			YTService movie = gson.fromJson(str, YTService.class);
			
			System.out.println(movie.data.movies.get(1).title);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
