package ch15;

public class MainTest {
	
	public static void main(String[] args) {
		
		Computer deskTop = new DeskTop();
		Computer myNoteBook = new MyNoteBook();
		
		deskTop.typing();
		deskTop.display();
		
		myNoteBook.display();
		
	}

	

}
