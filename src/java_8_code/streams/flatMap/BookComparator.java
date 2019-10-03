package java_8_code.streams.flatMap;

import java.util.Comparator;

import java_8_code.data.Book;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {

		if (b1.getPrice() > b2.getPrice()) {
			return 1;
		} else if (b1.getPrice() == b2.getPrice()) {
			return 0;
		} else {
			return -1;
		}
	}

}
