package java_8_code.functionalInterfaces;

import java.util.function.Function;

public class FuctionalInterfaceExample {

	static Function<String, String> firstFunction=(name) -> name.toUpperCase();
	static Function<String, String> andThenFunction=(name)-> name.toUpperCase().concat(" welcome");
	
	public static void main(String[] args) {
		
		System.out.println("First Function=  "+ firstFunction.apply("abhay"));
		System.out.println("andThen Function=  "+firstFunction.andThen(andThenFunction).apply("abhay"));
		System.out.println("compose Function=  "+firstFunction.compose(andThenFunction).apply("abhay"));

	}

}
