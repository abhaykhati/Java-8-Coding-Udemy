package java_8_code.streams.NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

	public static int sumOfNumbers(List<Integer> integerList) {

		return integerList.stream().reduce(1, (x, y) -> x + y);// Bad Practice : requires UNBOXING operations from
																// integer to int
	}

	public static int sumOfNumbersUsingIntStream() {

		return IntStream.rangeClosed(1, 6).sum();
		//123456=21 ->by using IntStream.rangeClosed(int startInclusive, int endExclusive)  (1+2+3+4+5+6)returns 21
		
		//return IntStream.range(1, 6).sum();
		//123456=15 ->by using IntStream.range(int startInclusive, int endExclusive) returns endExclusive - 1 (1+2+3+4+5) returns 15
		

	}

	public static void main(String[] args) {

		List<Integer> noOfIntegers = Arrays.asList(2, 3, 4, 5, 6);

		int sumOfNumbers = sumOfNumbers(noOfIntegers);
		System.out.println("sum of integers=  " + sumOfNumbers);
		
		System.out.println("sum of integers using IntStream.rangeClosed=  " + sumOfNumbersUsingIntStream());

	}

}
