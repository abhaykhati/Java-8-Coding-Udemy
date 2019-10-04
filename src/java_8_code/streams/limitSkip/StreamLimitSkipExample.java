package java_8_code.streams.limitSkip;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integers) {

		return integers.stream()

				.limit(2)// input will be 6,7

				//.reduce((a, b) -> a + b);
				.reduce(Integer::sum);
	}

	public static Optional<Integer> skip(List<Integer> integers) {

		return integers.stream()

				.skip(3)// will skip 6,7,8 and will take input as 9,10

				//.reduce((a, b) -> a + b);
				.reduce(Integer::sum);

	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);

		Optional<Integer> limitResult = limit(integers);
		int result = limitResult.isPresent() ? limitResult.get() : 0;

		System.out.println("The limit result is : " + result);

		Optional<Integer> skipResult = skip(integers);

		int result1 = skipResult.isPresent() ? skipResult.get() : 0;

		System.out.println("The skip result is : " + result1);

	}
}
