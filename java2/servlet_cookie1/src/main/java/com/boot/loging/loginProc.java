package com.boot.loging;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginProc")
public class loginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// JSESSIONID : 자바로 만들어진 서버 프로그램에서 기본적으로 브라우저가 첫 요청시 발급하는 쿠키
		// 브라우저에게 넘겨준 쿠키 이름인 memberId가 없다면 서버에서 생성한 쿠키를 담아라
		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");

		Cookie[] cookies = request.getCookies();

		Cookie cookie = null;

		String isSaveId = request.getParameter("isSaveId");
		if (isSaveId == null) {
			for (Cookie c : cookies) {
				// memberId => 시간을 0으로 돌리고 다시 response에 담아준다.
				c.setMaxAge(0); // 초단위 : 0으로 하면 삭제
				response.addCookie(c);
			}
		} else {
			// 쿠키 저장 코드
			cookie = new Cookie("memberId", mId);
			response.addCookie(cookie);
//			response.sendRedirect("home.jsp");
		}
		response.sendRedirect("home.jsp");

		for(Cookie reqCookie : cookies) {
			System.out.println("req cookie : " + reqCookie);
			System.out.println("cookie name : " + reqCookie.getName());
			System.out.println("cookie values : " + reqCookie.getValue());
			
			if(reqCookie.getName().equals("memberId")) {
				cookie = reqCookie;
			}
		}
		
		if(cookie == null) {
			System.out.println("쿠키 생성");
			cookie =  new Cookie("memberId", mId);
		}
		
		cookie.setMaxAge(60 * 60);
		System.out.println(cookie.getMaxAge());
		response.addCookie(cookie);
		
	}

}
