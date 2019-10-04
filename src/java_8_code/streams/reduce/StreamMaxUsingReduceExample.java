package java_8_code.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxUsingReduceExample {

	public static Integer findMaxValueWithIdentityValue(List<Integer> integerList) {

		return integerList.stream()
				// a variable holds the max value for each element in the iteration
						  .reduce(0, (a, b) -> (a > b) ? a : b);
	}

	public static Optional<Integer> findMaxValueWithOptional(List<Integer> integerList) {

		return integerList.stream()
				// a variable holds the max value for each element in the iteration
				          .reduce((a, b) -> (a > b) ? a : b);
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(5, 6, 7, 8, 9);

		Integer maxValue = findMaxValueWithIdentityValue(integers);
		System.out.println("max value with identity = " + maxValue);
		
		//List<Integer> integers2=new ArrayList<Integer>();
		
		Optional<Integer> findMaxValueWithOptional = findMaxValueWithOptional(integers);
		if (findMaxValueWithOptional.isPresent()) {
			System.out.println("Max with Optional=  "+ findMaxValueWithOptional.get());
			
		}
		

	}

}
