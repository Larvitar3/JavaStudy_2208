package db_connect.ch02;

import java.util.ArrayList;


public interface IMemberInfoDaoClone {

	ArrayList<MemberDtoClone> selectAll();
	MemberDtoClone select(String userName);
	int insert(MemberDtoClone dtoc);
	int update(MemberDtoClone dtoc);
	int delete(String userName);
	
}
