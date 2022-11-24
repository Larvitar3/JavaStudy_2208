package com.boot.life_cycle;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ms1")
public class Mservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@PostConstruct   
	public void postConstruct(){
		System.out.println(">>>>>>>>>>>postConstruct<<<<<<<<<<");
	}
	
	@Override
		public void init() throws ServletException {
			System.out.println(">>>>>>> init <<<<<<<");
		}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println(">>>>> service <<<<<");
	}
	
	@Override
	public void destroy() {
		System.out.println(">>>>>>destroy<<<<<");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(">>>>>>>> preDestroy <<<<<<<<<");  
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" >>>> do get <<<<<");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>>>do post <<<<");
	}

}
