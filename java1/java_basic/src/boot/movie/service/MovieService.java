package boot.movie.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import boot.movie.dto.RequestMovie;
import boot.movie.dto.ResponseMovie;
import boot.movie.interfaces.IMovieService;
import boot.movie.utils.DBHelper;

public class MovieService implements IMovieService{

	private DBHelper dbHelper;
	private  PreparedStatement psmt;
	private Connection conn;
	private ResultSet rs;
	
	public MovieService() {
		this.dbHelper = DBHelper.gerInstance();
	}
	
	// TODO
	private String selectQuery = " SELECT A.이름 AS 영화이름, "
			+ "A.개봉년도, A.매출액, A.관객수, A.평점, B.역, C.이름 AS 배우이름"
			+ " FROM 영화 AS A"
			+ " JOIN 출연 AS B"
			+ " ON A.번호 = B.영화번호"
			+ " JOIN 배우 AS C"
			+ " ON C.번호 = B.배우번호 ";
	
	@Override
	public List<ResponseMovie> selectAllMovieInfo() {
		List<ResponseMovie> list = new ArrayList<>();
		
		try {
			psmt = dbHelper.getConnention().prepareStatement(selectQuery);
			rs = psmt.executeQuery();

//			rs = dbHelper.getConnention().prepareStatement(selectQuery).executeQuery();
			
			while(rs.next()) {
				ResponseMovie movie = new ResponseMovie();
				movie.setMovieName(rs.getString("영화이름"));
				movie.setYear(rs.getString("개봉년도"));
				movie.setSales(rs.getString("매출액"));
				movie.setAudience(rs.getString("관객수"));
				movie.setName(rs.getString("배우이름"));
				movie.setRating(rs.getString("평점"));
				movie.setRoleName(rs.getString("역"));
				
				list.add(movie);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ResponseMovie> selectMovieByName(String movieName) {
		// LIKE 사용 , 공백 X
		
		String query =  "SELECT *"
				+ " FROM 영화"
				+ " WHERE 이름 LIKE ? ";
		
		List<ResponseMovie> list = new ArrayList<>();
		
		try {
			psmt = dbHelper.getConnention().prepareStatement(query);
			psmt.setString(1, "%" + movieName.trim() + "%");
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ResponseMovie movie = new ResponseMovie();
				movie.setMovieName(rs.getString("이름"));
				movie.setYear(rs.getString("개봉년도"));
				movie.setSales(rs.getString("매출액"));
				movie.setAudience(rs.getString("관객수"));
				movie.setRating(rs.getString("평점"));			
				list.add(movie);

			}
			System.out.println(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insertMovie(RequestMovie req) {
		// 트랜잭션 정상 쿼리가 등록 시 True 아니면 False 반환
		boolean flag = true;
		
		// 트랜잭션 사용
		// setAutoCommit 트랜잭션 처리 -> 기본값은 true로 바로 적용된다.
		try {
			
			dbHelper.getConnention().setAutoCommit(false); // false상태면 INSERT 되지 않는다 ★
			
			// 1. 영화 테이블의 마지막 번호 들고오기 (번호 추가할 시 자동 세팅)
			String query1 = " SELECT 번호 FROM 영화 ORDER BY 번호 DESC LIMIT 1 ";
			rs = dbHelper.getConnention().prepareStatement(query1).executeQuery();
			
			while(rs.next()) {
				int lastId = Integer.parseInt ( rs.getString("번호")) + 1 ;
				req.set영화번호(lastId);
				System.out.println("영화번호 : " + lastId);
			}
			
			// 2. 배우 테이블에 마지막 번호 들고오기 (번호 추가할 시 자동 세팅)
			String query2 = " SELECT 번호 FROM 배우 ORDER BY 번호 DESC LIMIT 1 ";
			rs = dbHelper.getConnention().prepareStatement(query2).executeQuery();
			
			while(rs.next()) {
				int lastId = Integer.parseInt(rs.getString("번호"))+1;
				req.set배우번호(lastId);
				System.out.println("배우 번호 : " + lastId );
			}
			
			// 영화 데이터 저장
			String qurey3 = " INSERT INTO 영화(번호, 이름, 개봉년도, 관객수, 평점) "
					+ "VALUES ( ? , ?, ?, ?, ? ) ";
			psmt = dbHelper.getConnention().prepareStatement(qurey3);
			psmt.setInt(1, req.get영화번호());
			psmt.setString(2, req.get영화이름());
			psmt.setInt(3, req.get개봉년도());
			psmt.setInt(4, req.get관객수());
			psmt.setDouble(5, req.get평점());
			psmt.executeUpdate();
			
			// , 배우 데이터 저장
			String qurey4 = " INSERT INTO 배우(번호, 이름, 출생, 키, 몸무게) "
					+ "VALUES ( ? , ?, ?, ?, ? ) ";
			psmt = dbHelper.getConnention().prepareStatement(qurey4);
			psmt.setInt(1, req.get배우번호());
			psmt.setString(2, req.get배우이름());
			psmt.setString(3, req.get출생());
			psmt.setInt(4, req.get키());
			psmt.setInt(5, req.get몸무게());
			psmt.executeUpdate();
			
			// 출연 데이터 저장
			String qurey5 = " INSERT INTO 출연(영화번호, 배우번호, 역할, 역) "
					+ "VALUES ( ? , ?, ?, ? ) ";
			psmt = dbHelper.getConnention().prepareStatement(qurey5);
			psmt.setInt(1, req.get영화번호());
			psmt.setInt(2, req.get배우번호());
			psmt.setInt(3, req.get역할());
			psmt.setString(4, req.get역());
			psmt.executeUpdate();
			
			dbHelper.getConnention().commit();
			dbHelper.getConnention().setAutoCommit(true);
			
		} catch (SQLException e) {
			try {
				dbHelper.getConnention().rollback();
				System.out.println("롤백!@~~");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				// 다시 원상복구로 돌려놓는것을 권장
				// dbHelper.getConnention().setAutoCommit(true);
				rs.close();
				psmt.close();
				dbHelper.connectionClose();
			} catch (Exception e) {

			}
		}
		
		return flag;
	}

	@Override
	public void updateMovie(String oldName, String newName) {
		String query = " UPDATE 영화 SET 이름 = ? WHERE 이름 = ? ";
		try {
			psmt = dbHelper.getConnention().prepareStatement(query);
			
			psmt.setString(1, newName);
			psmt.setString(2, oldName);
			psmt.executeUpdate();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				psmt.close();
				dbHelper.connectionClose();
			} catch (Exception e) {

			}
		}
		
	}

	@Override
	public void delteMovie(int movieId) {
		// 트랜잭션 사용
		try {
			
			dbHelper.getConnention().setAutoCommit(false);
			
			String query2 = " DELETE FROM 출연 WHERE 영화번호 = ? ";
			psmt = dbHelper.getConnention().prepareStatement(query2);
			psmt.setInt(1, movieId);
			psmt.executeUpdate();
			
			
			String query = " DELETE FROM 영화 WHERE 번호 = ? ";
			
			psmt = dbHelper.getConnention().prepareStatement(query);
			psmt.setInt(1, movieId);
			psmt.executeUpdate();
			
			dbHelper.getConnention().commit();
			dbHelper.getConnention().setAutoCommit(true);
			
		} catch (SQLException e) {
			try {
				dbHelper.getConnention().rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("롤백 ! ");
			// 둘 중 하나라도 맞지않으면 실행시키지 않기 위함
			// Ex )  출연 = 영화번호는 삭제 됐지만 영화 = 번호는 삭제되지않는 경우를 막기위함.
			
			e.printStackTrace();
		} 
		
	}
	public static void main(String[] args) {
		MovieService a = new MovieService();
		RequestMovie movie = new RequestMovie();
		
		// a.delteMovie(2);
		List<ResponseMovie> ab = a.selectMovieByName("그녀");
		for (ResponseMovie responseMovie : ab) {
			System.out.println(responseMovie);
		}
//		a.selectMovieByName("명량");
		
//		movie.set영화이름("이춘식의 모험기 4");
//		movie.set개봉년도(2023);
//		movie.set관객수(45691222);
//		movie.set평점(8.23);
//		
//		movie.set배우이름("이춘식");
//        movie.set출생("1988-10-18");
//        movie.set키(181);
//        movie.set몸무게(86);
//
//        movie.set역할(1);
//        movie.set역("이춘식 역");
//		
//		a.insertMovie(movie);
		
//		System.out.println(a.selectAllMovieInfo() + "실행");
		
	}

}
