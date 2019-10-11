package java_8_code.streams.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceListArrayToString {
	public static void main(String[] args) {

		// Reduce Array to String.
		String[] array = { "Mohan", "Sohan", "Mahesh" };

		Arrays.stream(array).reduce((x, y) -> x + "," + y).ifPresent(s -> System.out.println("Array to String: " + s));

		// Reduce List to String.
		List<String> list = Arrays.asList("Mohan", "Sohan", "Mahesh");

		list.stream().reduce((x, y) -> x + "," + y).ifPresent(s -> System.out.println("List to String: " + s));
	}
}
