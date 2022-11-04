package ch04;

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

import ch01.Todo;

public class HttpMainTest2 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.connect();

			int statusCode = connection.getResponseCode();

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line = null;

			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
			}
			
			String str = sb.toString();
			System.out.println(str);

			Gson gson = new Gson();

			Type type = new TypeToken<ArrayList<Todo>>() {
			}.getType();
			ArrayList<Todo> todos = gson.fromJson(str, type);
			for (Todo todo : todos) {
				System.out.println();
				System.out.println("변환 ▼");
				System.out.println(todo.toString());
			}

			System.out.println(type);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
