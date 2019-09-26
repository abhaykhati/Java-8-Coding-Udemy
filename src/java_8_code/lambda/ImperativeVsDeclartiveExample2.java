package java_8_code.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImperativeVsDeclartiveExample2 {

	public static void main(String[] args) {

		List<Integer> integerList =Arrays.asList(1,2,2,3,4,4,5,33,32,33,55,5,2,6,66,6);
		
		//IMPERATIVE approach to get unique list elements
		
		List<Integer> uniqueList=new ArrayList<>();
		for(Integer integer: integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("IMPERATIVE approach UNIQUE LIST=  "+ uniqueList);
		
		
		//DECLARATIVE approach to get unique list elements
		List<Integer>  uniqueList1=integerList.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println("DECLARATIVE approach UNIQUE LIST=  "+ uniqueList1);
		
		
	}

}
