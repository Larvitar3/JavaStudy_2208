package ch01;

public class Todo {

	int userId;
	int id;
	String title;
	boolean complete;

	@Override
	public String toString() {
		return "Todo [userId=" + userId + ", id=" + id + ", title=" + title + ", complete=" + complete + "]";
	}

}
