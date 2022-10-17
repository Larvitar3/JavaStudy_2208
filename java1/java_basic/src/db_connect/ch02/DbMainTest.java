package db_connect.ch02;

import java.util.ArrayList;

public class DbMainTest {
	
	public static void main(String[] args) {
	
		MemberInfoSqlDaoClone infoSqlDaoClone = new MemberInfoSqlDaoClone();
		
//		ArrayList<MemberDtoClone> arrayList = infoSqlDaoClone.selectAll();
//		System.out.println(arrayList);
//		// SELECT ALL
		
//		MemberDtoClone memberDtoClone = infoSqlDaoClone.select("이승기");
		
//		if(memberDtoClone == null) {
//			System.out.println("요청하신 값이 없습니다.");
//		} else {
//			System.out.println(memberDtoClone.getUserName());
//			System.out.println(memberDtoClone.getBirtYear());
//			System.out.println(memberDtoClone.getAddress());
//			System.out.println(memberDtoClone.getMobile());
//		}
//		// SELECT 
		
//		memberDtoClone.setUserName("애쉬");
//		memberDtoClone.setBirtYear(1985);
//		memberDtoClone.setAddress("서울");
//		memberDtoClone.setMobile("010-1589-1589");
//		
//		int resultQueryCount = infoSqlDaoClone.insert(memberDtoClone);
//		System.out.println("실행 횟수 : " + resultQueryCount);
//		// INSERT
		
		
//		memberDtoClone.setUserName("애쉬");
//		memberDtoClone.setMobile("010-5555-6666");
//		infoSqlDaoClone.update(memberDtoClone);
//		// UPDATE
		
		int deleteRowCount = infoSqlDaoClone.delete("애쉬");
		System.out.println("삭제 실행 횟수" + deleteRowCount);
		
//		infoSqlDaoClone.delete("애쉬");
		
		
		
		
	}
}
