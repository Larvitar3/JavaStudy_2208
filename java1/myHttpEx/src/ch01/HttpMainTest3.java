package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest3 {

	public static void main(String[] args) {

		// http 통신을 하기위해서 URL 객체를 생성

		try {

			URL url = new URL("https://jsonplaceholder.typicode.com/photos/16");
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
			Photos photos = gson.fromJson(str, Photos.class);
			System.out.println(photos);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
