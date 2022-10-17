package db_connect.ch01;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class MemberDto {

	@NonNull
	private String mamberId;
	@NonNull
	private String memberName;
	private String memberAddress;
	
}
