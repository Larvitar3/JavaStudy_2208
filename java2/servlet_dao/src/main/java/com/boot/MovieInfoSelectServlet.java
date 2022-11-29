package com.boot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MovieDao;
import com.dto.MovieDto;

@WebServlet("/MovieInfoSelectServlet")
public class MovieInfoSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieInfoSelectServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청 처리
		request.setCharacterEncoding("UTF-8");
		
		// 응답 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		MovieDao dao = new MovieDao();
		MovieDto movie = dao.selectMovieByTitle(request.getParameter("movieName"));
		
			out.print(movie.get번호());
			out.print(movie.get이름());
			out.print(movie.get개봉년도());
			out.print(movie.get관객수());
			out.print(movie.get매출액());
			out.print(movie.get평점());
			out.print("</br>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
