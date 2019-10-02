package java_8_code.streams.toMap;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import java_8_code.data.Book;

public class ConvertToMap {
	public Map<String, String> listToMap(List<Book> books) {

		return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
	}

	public Map<Integer, Book> listToMapWithDupKeyError(List<Book> books) {

		return books.stream().collect(Collectors.toMap(Book::getReleaseYear, Function.identity()));

	}

	public Map<Integer, Book> listToMapWithDupKey(List<Book> books) {

		return books.stream().collect(
				Collectors.toMap(Book::getReleaseYear, Function.identity(), (existing, replacement) -> existing));

	}

	public Map<Integer, Book> listToConcurrentMap(List<Book> books) {

		return books.stream().collect(
				Collectors.toMap(Book::getReleaseYear, Function.identity(), (o1, o2) -> o1, ConcurrentHashMap::new));

	}

	public TreeMap<String, Book> listToSortedMap(List<Book> books) {

		return books.stream()

				.sorted(Comparator.comparing(Book::getName))

				.collect(Collectors.toMap(Book::getName, Function.identity(), (o1, o2) -> o1, TreeMap::new));

	}
}
