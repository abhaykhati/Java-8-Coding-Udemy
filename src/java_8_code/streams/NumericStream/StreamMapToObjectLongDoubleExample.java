package java_8_code.streams.NumericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMapToObjectLongDoubleExample {
	
	
	public static List<Integer> mapToObject() {
		
		List<Integer> mapToObjectList = IntStream.rangeClosed(1, 5)
		.mapToObj(a ->{ return new Integer(a);})
		.collect(Collectors.toList());
		return mapToObjectList;
	}
	
	public static long mapToLong() {
		long mapTolong= IntStream.rangeClosed(1, 5)
		.mapToLong(a-> {return a;})
		.sum();
		return mapTolong;
	}
	
	public static double mapToDouble() {
		double mapToDouble= IntStream.rangeClosed(1, 5)
	//	.mapToDouble(a-> {return a;})
		.mapToDouble(a ->{ return new Double(a);})
		.sum();
		return mapToDouble;
	}
	
	public static void main(String[] args) {
		
		mapToObject().forEach(System.out::println);
		
		long mapToLong = mapToLong();
		System.out.println("sum of mapToLong=  "+mapToLong);
		
		double mapToDouble = mapToDouble();
		System.out.println("sum of mapToDouble=  "+mapToDouble);
	}

}
