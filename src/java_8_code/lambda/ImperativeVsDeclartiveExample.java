package java_8_code.lambda;

import java.util.stream.IntStream;

public class ImperativeVsDeclartiveExample {

	public static void main(String[] args) {

		// imperative style of programming for summation of first 100 numbers
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Sum using imperative approach=  " + sum);
		
		
		
		// declarative style of programming for summation of first 100 numbers

		int sum1 = IntStream.rangeClosed(0, 100).parallel().sum();

		System.out.println("Sum using declarative approach=  " + sum);

	}

}
