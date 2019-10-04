package java_8_code.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateEvenOddExample {
	static void printEvenNumbers(Integer value, Predicate<Integer> evenChecker) {

		if (evenChecker.test(value)) {
			System.out.println(value + " is Even");
		} else {
			System.out.println(value + " is Odd");
		}
	}

	public static void main(String[] args) {
		
		Predicate<Integer> oddEvenPredicate = i -> i % 2 == 0;
		printEvenNumbers(66, oddEvenPredicate);
		
	}

}
