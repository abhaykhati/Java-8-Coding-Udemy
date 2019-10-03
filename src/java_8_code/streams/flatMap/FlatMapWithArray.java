package java_8_code.streams.flatMap;

import java.util.Arrays;

public class FlatMapWithArray {

	public static void main(String[] args) {
		Integer[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
			Arrays.stream(data)
							.flatMap(Arrays::stream)
							.filter(num -> num % 2 == 0)
							.forEach(System.out::println);
	}

}
