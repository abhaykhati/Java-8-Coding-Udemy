package java_8_code.streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapToMap {

	public static void main(String[] args) {
		
		List<List<Integer>> arraylist = Arrays.asList(
			      Arrays.asList(1, 2, 3, 4),
			      Arrays.asList(5, 6, 7, 8),
			      Arrays.asList(9, 10, 11, 12)
			    );  
			 
			System.out.println(arraylist);
			// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
			 
			List<Integer> results = arraylist.stream()
			      .flatMap(intList -> intList.stream().map(i -> i*2))
			      .collect(Collectors.toList());
			 
			System.out.println(results);
			// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24]
	}
}
