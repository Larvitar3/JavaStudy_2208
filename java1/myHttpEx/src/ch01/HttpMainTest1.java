package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpMainTest1 {

	public static void main(String[] args) {

		// http 통신을 하기위해서 URL 객체를 생성

		try {

			URL url = new URL("https://jsonplaceholder.typicode.com/posts/15");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.connect();

			int statusCode = connection.getResponseCode();
			System.out.println("statusCode :  " + statusCode);

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
			System.out.println("▼ 지정한 값만큼의 숫자만 출력 ▼");
			System.out.println(str.substring(40, 65));

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
