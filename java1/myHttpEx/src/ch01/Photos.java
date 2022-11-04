package ch01;

public class Photos {

	int albumId;
	int id;
	String title;
	String url;
	String thumbnailUrl;

	@Override
	public String toString() {
		return "Photos [albumId=" + albumId + ", id=" + id + ", title=" + title + ", url=" + url + ", uhumbnailUrl="
				+ thumbnailUrl + "]";
	}

}
