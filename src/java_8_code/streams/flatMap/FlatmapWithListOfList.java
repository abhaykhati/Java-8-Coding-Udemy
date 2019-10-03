package java_8_code.streams.flatMap;

import java.util.Arrays;
import java.util.List;

import java_8_code.data.Book;

public class FlatmapWithListOfList {

	public static void main(String[] args) {
		List<Book> list1 = Arrays.asList(new Book("AAA", 10), new Book("BBB", 20));
		List<Book> list2 = Arrays.asList(new Book("XXX", 30), new Book("ZZZ", 15));
		
		List<List<Book>> finalList = Arrays.asList(list1, list2);
		
		Book book = finalList.stream().flatMap(list -> list.stream()).min(new BookComparator()).get();
		
		System.out.println("Name:" + book.getName() + ", Price:" + book.getPrice());
	}

}
