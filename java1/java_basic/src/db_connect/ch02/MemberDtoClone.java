package db_connect.ch02;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class MemberDtoClone {

	@NonNull
	private String userName;
	@NonNull
	private int birtYear;
	@NonNull
	private String address;
	private String mobile;
}
