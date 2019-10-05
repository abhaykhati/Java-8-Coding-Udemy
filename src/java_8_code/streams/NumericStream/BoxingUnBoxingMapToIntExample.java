package java_8_code.streams.NumericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingMapToIntExample {

	
	public static List<Integer> boxing(){
		
		List<Integer> boxedIntegerList = IntStream.rangeClosed(1, 10)
		.boxed() //Stream<Integer>
		.collect(Collectors.toList());//all the elements will be passed one by one to get to the result as the collection.
		return boxedIntegerList;
	}
	
	public static int unBoxing(List<Integer> integerList) {
		
		 int unBoxingToInt = integerList
		.stream()
		.mapToInt(Integer::intValue)// IntStream (int value of the wrapper class)
		//.mapToInt(s ->s.intValue()) // will also work with this lambda
		.sum();
		return unBoxingToInt;
		
	}
	
	public static void main(String[] args) {
		
		boxing().forEach(a->System.out.println(a));
		
		List<Integer> boxing = boxing();
		int unBoxingIntSum = unBoxing(boxing);
		System.out.println("unBoxingIntSum=   "+unBoxingIntSum);
		
		
		
		
		
	}
}
