package java_8_code.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static Comparator<Integer> comparator=(a,b)-> a.compareTo(b);

	public static void main(String[] args) {
		
		BinaryOperator<Integer> binaryOperatorMultiply=(a,b)-> a*b;
		System.out.println("binaryOperatorMultiply=  "+ binaryOperatorMultiply.apply(4, 5));
	
		BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
		System.out.println("Result of maxBy is =  "+ maxBy.apply(5, 8));// return max integer
		
		BinaryOperator<Integer> minBy=BinaryOperator.minBy(comparator);
		System.out.println("Result of minBy is =  "+ minBy.apply(5, 8)); //return minimum integer
		
		

	}

}
