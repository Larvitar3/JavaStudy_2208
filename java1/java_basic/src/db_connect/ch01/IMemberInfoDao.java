package db_connect.ch01;

import java.util.ArrayList;

public interface IMemberInfoDao {

	// 기능 정의 CRUD
	ArrayList<MemberDto> selectAll();
	MemberDto select(String memberId);
	int insert(MemberDto dto);
	int update(MemberDto dto);
	int delete(String memberId);
	
}
