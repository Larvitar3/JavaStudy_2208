package ch05;

public class Comments {

	int postId;
	int id;
	String name;
	String email;
	String body;

	@Override
	public String toString() {
		return "Comments [postId=" + postId + ", id=" + id + ", name=" + name + ", email=" + email + ", body=" + body
				+ "]";
	}

}
