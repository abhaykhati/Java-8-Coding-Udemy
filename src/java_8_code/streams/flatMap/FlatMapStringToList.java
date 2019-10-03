package java_8_code.streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStringToList {
	
	public static void main(String[] args) {
		
		List<List<String>> listOfList = Arrays.asList(
			      Arrays.asList("Java", "Django", "Vue", "Spring Cloud"),
			      Arrays.asList("Python", "Spring Boot", "React"),
			      Arrays.asList("Angular", "JQuery", "Spring JPA")
			    );  
			 
			System.out.println(listOfList);
			// [[Java, Django, Vue, Spring Cloud], [Python, Spring Boot, React], [Angular, JQuery, Spring JPA]]
			 
			List<String> results = listOfList.stream()
							      .flatMap(strList -> strList.stream())
							      .filter(str -> str.contains("Spring"))
							      .collect(Collectors.toList());
			 
			System.out.println(results);
			// [Spring Cloud, Spring Boot, Spring JPA]
	}

}
