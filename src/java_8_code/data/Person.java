package java_8_code.data;

import java.util.Optional;

public class Person {

	private Integer id;
	private String name;

	Optional<Country> country;

	public Person() {
	}

	public Person(Optional<Country> country) {
		this.country = country;
	}

	public Optional<Country> getCountry() {
		return country;
	}

	public void setCountry(Optional<Country> country) {
		this.country = country;
	}

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
