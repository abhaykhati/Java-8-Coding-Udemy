package java_8_code.methodReference;

import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {

		Function<String,String> stringUsingLambda=s -> s.toUpperCase();
		System.out.println(stringUsingLambda.apply("welcome-2-java-8"));
		
		Function<String, String> stringUsingMethodReference=String::toUpperCase;
		System.out.println(stringUsingMethodReference.apply("hello java"));
		
		
	}

}
