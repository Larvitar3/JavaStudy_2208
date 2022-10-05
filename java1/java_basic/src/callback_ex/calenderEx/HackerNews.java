package callback_ex.calenderEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HackerNews{


	// 응답자
	
	OnWriteArticle onWriteArticle = new OnWriteArticle() {
		
		@Override
		public void printNews(String article) {
			System.out.println("****** Hacker News ******");
			System.out.println();
			System.out.println(article);
			System.out.println();
			System.out.println("기사 작성일 : " + nowDate());
			
		}
	};
	
	private String nowDate() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		
		return dateFormat.format(Calendar.getInstance().getTimeInMillis());
	}

	

}
