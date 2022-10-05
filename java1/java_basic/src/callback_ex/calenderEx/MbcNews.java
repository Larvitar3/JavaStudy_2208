package callback_ex.calenderEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MbcNews {

	private String nowDate() {
		
		// 1. Calendar.long
		// 2. Date
		// DateFormat
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		
		return dateFormat.format(Calendar.getInstance().getTimeInMillis());
	}
	
	public void printArticle(String article) {
		System.out.println("{{{{ Hacker News }}}}");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " );
	}
	
}
