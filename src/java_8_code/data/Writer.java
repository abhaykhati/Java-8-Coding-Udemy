package java_8_code.data;

import java.util.List;

public class Writer {
	
	private String name;
	
	private List<Book>	books;

	public Writer(String name, List<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return this.books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}

