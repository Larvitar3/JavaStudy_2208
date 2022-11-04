package ch05;

import ch05.User.Address.Geo;
import lombok.Data;

@Data
public class User {
	int id;
	String name;
	String username;
	String email;
	Address address;
	String street;
	String suite;
	String city;
	String zipcode;
	Geo geo;
	String lat;
	String lng;
	String phone;
	String website;
	Company company;
	String catchPhrase;
	String bs;

	class Address {
		String street;
		Geo geo;
		String suite;
		String city;
		String zipcode;

		class Geo {
			String lat;
			String lng;
		}
	}

	class Company {
		String name;
		String catchPhrase;
		String bs;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address="
				+ address + ", street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode=" + zipcode
				+ ", geo=" + geo + ", lat=" + lat + ", lng=" + lng + ", phone=" + phone + ", website=" + website
				+ ", company=" + company + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
	}

}
