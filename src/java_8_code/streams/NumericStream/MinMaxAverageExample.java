package java_8_code.streams.NumericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMaxAverageExample {
	
	public static void main(String[] args) {
		
		OptionalInt maxOptionalInt = IntStream.rangeClosed(1, 50).max();
		//System.out.println(optionalInt.isPresent() ?optionalInt.getAsInt() :0 );
		System.out.println(" max of optionalInt =  "+maxOptionalInt.getAsInt());
		
		OptionalInt minOptionalInt = IntStream.rangeClosed(1, 50).min();
		System.out.println(" min of optionalInt =  "+minOptionalInt.getAsInt());
		
		OptionalDouble averageOptionalDouble = IntStream.rangeClosed(1, 50).average();
		System.out.println(" average of OptionalDouble =  "+averageOptionalDouble.getAsDouble());
		
	}

}
