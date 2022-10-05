package callback_ex.calenderEx;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest {

	public static void main(String[] args) {
		// Calendar란 날짜 관련 클래스 입니다.
		// 달력이나 시간계산등을 사용 할 때 많이 사용하는 클래스
		//Calendar calendar = new Calendar(); // --> new로 객체 생성 불가!
		Calendar calendar = Calendar.getInstance();
		// static 클래스의 경우 클래스로 접근해서 가져올 수 있다.
		
		// Calendar 호출할 때 마다 매번 생성되는게 아니라
		// JVM 미리 프로그램에서 사용할 객체들을 띄워 준다.

		System.out.println(calendar.getTimeInMillis());

		// 보기 불편하기 때문에 형식을 개발자마다 지정해서 사용할 수 있도록 만들어 놓았다.
		DateFormat dateFormat = new SimpleDateFormat();
		// 현재 시간을 내가 정한 format 형식으로 변환
		// DateFormat은 단지 형식을 만들어주기 위한 것

		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);
	}

}
