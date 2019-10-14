package java_8_code.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
	
	public static void main(String[] args) {
		
		Multiplier multiplyer=new MultiplierImpl();
		
		List<Integer> asList = Arrays.asList(1,3,5);
		System.out.println("Result of multiply is= "+multiplyer.multiply(asList));
		
		System.out.println("default list size is=  "+ multiplyer.size(asList));
		
		System.out.println("static list, IS IT EMPTY?=  "+Multiplier.isListNotEmpty(asList));
		
		
		
		

	}

}
