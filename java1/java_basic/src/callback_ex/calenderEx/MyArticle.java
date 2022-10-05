package callback_ex.calenderEx;

public class MyArticle {
// 호출자로 만들기 - 주소값을 알아야한다.
	
	String article;
	OnWriteArticle onWriteArticle;

	public MyArticle(String article) {
		this.article = article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public void setOnWriteArticle(OnWriteArticle onWriteArticle) {
		this.onWriteArticle = onWriteArticle;
	}

	public void complete() {
		onWriteArticle.printNews(this.article);
	}

}
