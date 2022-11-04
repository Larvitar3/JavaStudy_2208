package ch05;

import java.util.ArrayList;
import java.util.List;

public class YTService {

	String status;
	String status_message;
	Data data;

	@Override
	public String toString() {
		return "Movie [status=" + status + ", status_message=" + status_message + ", data=" + data + "]";
	}

	class Data {
		int movie_count;
		int limit;
		int page_number;
		ArrayList<Movies> movies;

		@Override
		public String toString() {
			return "Data [movie_count=" + movie_count + ", limit=" + limit + ", page_number=" + page_number
					+ ", movies=" + movies + "]";
		}

		class Movies {
			int id;
			String url;
			String imdb_code;
			String title;
			String title_english;
			String title_long;
			String slug;
			int year;
			double rating;
			int runtime;
			List<String> genres;
			String summary;
			String description_full;
			String synopsis;
			String yt_trailer_code;
			String language;
			String mpa_rating;
			String background_image;
			String background_image_original;
			String small_cover_image;
			String medium_cover_image;
			String large_cover_image;
			String state;

		}

	}

}
