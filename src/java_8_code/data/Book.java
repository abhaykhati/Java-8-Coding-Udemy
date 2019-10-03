package java_8_code.data;

public class Book {

	private String name;

	private int releaseYear;

	private String isbn;

	private int price;

	@Override

	public String toString() {

		return "Book{" +

				"name='" + name + '\'' +

				", releaseYear=" + releaseYear +

				", isbn='" + isbn + '\'' +

				'}';

	}

	public int getPrice() {
		return this.price;
	}

	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getReleaseYear() {

		return releaseYear;

	}

	public void setReleaseYear(int releaseYear) {

		this.releaseYear = releaseYear;

	}

	public String getIsbn() {

		return isbn;

	}

	public void setIsbn(String isbn) {

		this.isbn = isbn;

	}

	public Book(String name, int releaseYear, String isbn) {

		this.name = name;

		this.releaseYear = releaseYear;

		this.isbn = isbn;

	}
}
