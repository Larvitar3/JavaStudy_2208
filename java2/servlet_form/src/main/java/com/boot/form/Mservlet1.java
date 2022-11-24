package com.boot.form;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/boot1")
public class Mservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--- do get ---");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		System.out.println("email :  " + email);
		System.out.println("pwd :  " + pwd);
		
		String[] animal = request.getParameterValues("like");
		if(animal != null) {
			for(int i = 0; i < animal.length; i++) {
				System.out.println(animal[i]);
			}
		}
		
		Enumeration<String> animalName = request.getParameterNames();
		while(animalName.hasMoreElements()) {
			String data = animalName.nextElement();
			System.out.println("key 값 확인  :  "+data);
		}

		
		String number = request.getParameter("number");
		System.out.println("like num : " + number);

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("--- do post ---");
	}

}
