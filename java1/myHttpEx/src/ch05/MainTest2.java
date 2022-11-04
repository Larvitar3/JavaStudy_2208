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

public class MainTest2 {
	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.connect();

			int statusCode = connection.getResponseCode();

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			System.out.println("연결 확인 : "+statusCode);

			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
			}
			
			String str = sb.toString();
			System.out.println(str);
			
			Gson gson = new Gson();	
			
			Type type = new TypeToken<ArrayList<User>>() {}.getType();
			
			ArrayList<User> arrayUsers = gson.fromJson(str, type);
			
			for (User user : arrayUsers) {
				System.out.println(user.toString());
			}
			
//			System.out.println(arrayUsers.get(1).company);
//			System.out.println(arrayUsers.get(1).name);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
