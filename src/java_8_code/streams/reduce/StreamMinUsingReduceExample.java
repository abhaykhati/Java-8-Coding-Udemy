package java_8_code.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinUsingReduceExample {

	public static Integer findMinValueWithIdentityValue(List<Integer> integerList) {

		return integerList.stream()
				// a variable holds the max value for each element in the iteration
				.reduce(0, (a, b) -> (a < b) ? a : b);
	}

	public static Optional<Integer> findMinValueWithOptional(List<Integer> integerList) {

		return integerList.stream()
				// a variable holds the max value for each element in the iteration
				.reduce((a, b) -> (a < b) ? a : b);
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(5, 6, 7, 8, 9);

		Integer maxValue = findMinValueWithIdentityValue(integers);
		System.out.println("max value with identity = " + maxValue);

		// List<Integer> integers2=new ArrayList<Integer>();

		Optional<Integer> findMinValueWithOptional = findMinValueWithOptional(integers);
		if (findMinValueWithOptional.isPresent()) {
			System.out.println("Max with Optional=  " + findMinValueWithOptional.get());

		}
		else {
			System.out.println("No Input Found");
		}

	}

}
