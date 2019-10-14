package java_8_code.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample1  {

	public static void main(String[] args) {

		 List<String> stringList = Arrays.asList("khati","anand","ramesh", "rajani","prachi","bhagyashree");
		 
		 /*old way of sorting prior to JAVA 8*/
		
		/* Collections.sort(stringList);
		 System.out.println("sort using prior java 8 "+stringList);*/
		 
		 /*JAVA 8 way of sorting*/
		 
		 
		 stringList.sort(Comparator.naturalOrder());
		 System.out.println(" natural order sorting using compartator");
		 stringList.forEach(a -> System.out.println(a));	
		 
		 stringList.sort(Comparator.reverseOrder());
		 System.out.println(" reverse order sorting using compartator");
		 stringList.forEach(b -> System.out.println(b));
		 
		 
		 
		 
		 
	}

}
