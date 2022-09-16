package studyTest;

public class Book {
	private String title;
	private int toTalpage;
	private String author;
	
	public Book(String title, String author){
		this.title = title;
		this.toTalpage = toTalpage;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getToTalpage() {
		return toTalpage;
	}
	public void setToTalpage(int toTalpage) {
		this.toTalpage = toTalpage;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	} 

	public void showInfo() {
		System.out.println("==== 책 정보 ====");
		System.out.println("책 제목 :  " + title);
		System.out.println("저 자 :  " + author);
	}
	
	
	
	
	
	
	
	
	
	
}
