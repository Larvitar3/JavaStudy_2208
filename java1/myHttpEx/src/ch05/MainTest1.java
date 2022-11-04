package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainTest1 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");
			connection.connect();
			
			int statusCode = connection.getResponseCode();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			
			System.out.println(statusCode);
			
			if(statusCode == 200) {
				while((line =  reader.readLine()) != null) {
					sb.append(line + "\n");
				}
			}
			
			String str = sb.toString();
			Gson gson = new Gson();
			
			Type type = new TypeToken<ArrayList<Comments>>() {}.getType();
			ArrayList<Comments> commentss = gson.fromJson(str, type);
			for (Comments comments : commentss) {
				System.out.println("-----변환 ▼-----");
				System.out.println(comments.toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
