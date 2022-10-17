package db_connect.ch01;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		
		MemberInfoSqlDao infoSqlDao = new MemberInfoSqlDao();
		MemberDto memberDto = infoSqlDao.select("DANG");
		
//		if(memberDto == null) {
//			System.out.println("요청하신 값이 없습니다.");
//		}else {
//			System.out.println(memberDto.getMamberId());
//			System.out.println(memberDto.getMemberName());
//			System.out.println(memberDto.getMemberAddress());
//		}
//		
//		ArrayList<MemberDto> arrayList = infoSqlDao.selectAll();
//		System.out.println(arrayList);
//		
//		System.out.println("=======================");
//		
	int deleteRowCount = infoSqlDao.delete("Han");
		System.out.println(deleteRowCount);
//		
//		System.out.println("----------------");
//		MemberDto memberDto2 = new MemberDto();
//		memberDto2.setMamberId("abc");
//		memberDto2.setMemberName("티모");
//		memberDto2.setMemberAddress("부산시 진구");
		
//		int resultQueryCount = infoSqlDao.insert(memberDto2);
//		System.out.println(resultQueryCount);
		
//		MemberDto memberDto3 = new MemberDto();
//		memberDto3.setMamberId("abc");
//		memberDto3.setMemberName("티모");
//		memberDto3.setMemberAddress("부산시 진구");
//		infoSqlDao.insert(memberDto3);
		
//		MemberDto memberDto2 = new MemberDto();
//		memberDto2.setMamberId("abc");
//		memberDto2.setMemberName("티모2");
//		infoSqlDao.update(memberDto2);
//		
		
	}
	
}
