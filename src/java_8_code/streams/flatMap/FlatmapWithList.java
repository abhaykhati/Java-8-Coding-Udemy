package java_8_code.streams.flatMap;

import java.util.Arrays;
import java.util.List;

import java_8_code.data.Book;
import java_8_code.data.Writer;

public class FlatmapWithList {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("AAA", 10), new Book("BBB", 20));

		Writer w1 = new Writer("Mohan", books);
		
		books = Arrays.asList(new Book("XXX", 30), new Book("ZZZ", 15));
		Writer w2 = new Writer("Sohan", books);

		List<Writer> writers = Arrays.asList(w1, w2);
		
		Book book = writers.stream().flatMap(writer -> writer.getBooks().stream()).max(new BookComparator()).get();

		System.out.println("Name:" + book.getName() + ", Price:" + book.getPrice());
	}

}
