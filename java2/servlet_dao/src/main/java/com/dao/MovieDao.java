package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.MovieDto;

public class MovieDao {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";

	String dbUser = "root";
	String dbPw = "asd1234";
	String driverName = "com.mysql.cj.jdbc.Driver";

	public MovieDao() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("다오 실행");
	}

	// DB 연결

	// CRUD 처리
	public List<MovieDto>  selectMovie() {
		List<MovieDto> list = new ArrayList<>();
		
		String query = "SELECT * FROM 영화 ";
		
		try {
			conn = DriverManager.getConnection(url,dbUser,dbPw);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MovieDto dto = new MovieDto();
				dto.set번호(rs.getString("번호"));
				dto.set이름(rs.getString("이름"));
				dto.set개봉년도(rs.getString("개봉년도"));
				dto.set매출액(rs.getString("매출액"));
				dto.set관객수(rs.getString("관객수"));
				dto.set평점(rs.getString("평점"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public MovieDto selectMovieByTitle(String movieName) {
		String query = "SELECT * FROM 영화 WHERE 이름 = ? ";
		
		MovieDto dto = null;
		
		try {
			conn = DriverManager.getConnection(url,dbUser,dbPw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, movieName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new MovieDto();
				dto.set번호(rs.getString("번호"));
				dto.set이름(rs.getString("이름"));
				dto.set개봉년도(rs.getString("개봉년도"));
				dto.set매출액(rs.getString("매출액"));
				dto.set관객수(rs.getString("관객수"));
				dto.set평점(rs.getString("평점"));
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;

	}

	public void insertMovie() {
		
	}

	public void updataMovie() {
		
	}

	public void delete() {

	}

}
