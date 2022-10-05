package callback_ex.calenderEx;

public class MainTest1 {


	public static void main(String[] args) {
		HackerNews hackerNews = new HackerNews();
		MyArticle article = new MyArticle("오늘 날씨가 덥네요");
		
		article.setOnWriteArticle(hackerNews.onWriteArticle);
		
		article.complete(); // HackerNews 에 있는 PrintArticle 을 
		
	}
	
}
