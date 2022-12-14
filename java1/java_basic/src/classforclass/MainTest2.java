package classforclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainTest2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c3 = Class.forName("java.lang.String");
		
		Constructor<String>[] cons = c3.getConstructors();
		
		for (Constructor<String> constructor : cons) {
			System.out.println(constructor);
		}
		
		System.out.println("==============================");
		
		Method[] methods = c3.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		
	}

}
