package java_8_code.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	public static void main(String[] args) {
		
		/*UnaryOperator : 
		 * when there is use case like if the input
		 * and output is of same type then 
		 * instead of using Function interface use UnaryOperator
		 * */
		
		
		UnaryOperator<String> unaryOperator=s -> s.concat("welcome").toUpperCase();
		System.out.println(unaryOperator.apply("java"));

		
	}

}
