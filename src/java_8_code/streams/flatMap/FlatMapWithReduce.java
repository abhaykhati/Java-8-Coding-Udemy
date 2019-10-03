package java_8_code.streams.flatMap;

import java.util.Arrays;
import java.util.List;

public class FlatMapWithReduce {
	
	public static void main(String[] args) {
		List<List<Integer>> listOfList = Arrays.asList(
			      Arrays.asList(1, 2, 3, 4),
			      Arrays.asList(5, 6, 7, 8),
			      Arrays.asList(9, 10, 11, 12)
			    );  
			 
			System.out.println(listOfList);
			// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
			 
			int sum = listOfList.stream()
			      .flatMap(intList -> intList.stream())
			      .reduce(0, (i1, i2) -> i1 + i2);
			 
			System.out.println(sum);
			// 78
	}

}
