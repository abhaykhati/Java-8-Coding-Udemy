package java_8_code.functionalInterfaces;

public class FuctionalInterfaceExample2 {
	
	public static String performConcat() {
		
		
		return FuctionalInterfaceExample.andThenFunction.apply("anand");
	}

	
	public static void main(String[] args) {
		
		String performConcat = performConcat();
		System.out.println(performConcat);
		
	}

}
