package java_8_code.streams.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java_8_code.data.Developer;

public class FlatMapWithCustomObjectToList {

	public static void main(String[] args) {
		
		List<Developer> developers = Arrays.asList(
			      new Developer("Jack", Stream.of("Java", "Node.js", "Angular")
			            .collect(Collectors.toSet())),
			      new Developer("Joe", Stream.of("C++", "ActiveMQ", "HTML", "CSS", "Java")
			            .collect(Collectors.toSet())),
			      new Developer("Peter", Stream.of("Python", "Node.js", "C++", "Vue.js")
			            .collect(Collectors.toSet())),
			      new Developer("Mary", Stream.of("Node.js", "Angular", "React", "CSS")
			            .collect(Collectors.toSet()))
			    );  
			 
			//System.out.println(developers);
			// [{name = Jack, skills = [Java, Node.js, Angular]}, {name = Joe, skills = [Java, C++, CSS, HTML, ActiveMQ]}, {name = Peter, skills = [Vue.js, C++, Node.js, Python]}, {name = Mary, skills = [CSS, Node.js, React, Angular]}]
			 
			Set<String> skills = developers.stream()
			      .flatMap(developer -> developer.getSkills().stream())
			      .distinct()
			      .collect(Collectors.toSet());
			 
			//System.out.println(skills);
			// [Java, Vue.js, C++, CSS, Node.js, HTML, ActiveMQ, React, Angular, Python]
			
			skills.forEach(skill -> System.out.println(skill));
	}
}
