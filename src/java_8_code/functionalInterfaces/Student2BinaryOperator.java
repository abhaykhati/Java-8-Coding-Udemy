package java_8_code.functionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import java_8_code.data.Student2;

public class Student2BinaryOperator {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Shyam", 22, "A");
		Student2 s2 = new Student2("Ram", 23, "A");
		Student2 s3 = new Student2("Mohan", 22, "B");
		Student2 s4 = new Student2("Ramesh", 21, "B");
		
		List<Student2> list = Arrays.asList(s1, s2, s3, s4);
		
		Comparator<Student2> ageComparator = Comparator.comparing(Student2::getAge);
		
		// Using BinaryOperator.maxBy
		System.out.println("---BinaryOperator.maxBy---");
		
		Map<String, Optional<Student2>> eldestByClass = 
				list.stream().collect(Collectors
						.groupingBy(Student2::getClassName, 
									Collectors
									.reducing(BinaryOperator
									.maxBy(ageComparator))));
		
		eldestByClass.forEach((k, v) -> System.out.println("Class:" + k + " Age:"
							+ ((Optional<Student2>) v).get().getAge() 
							+ " Name:" 
							+ ((Optional<Student2>) v).get().getName()));

		// Using BinaryOperator.minBy
		System.out.println("---BinaryOperator.minBy---");
		
		Map<String, Optional<Student2>> youngestByClass = list
														  .stream()
														  .collect(Collectors
														  .groupingBy(Student2::getClassName, Collectors
														  .reducing(BinaryOperator.minBy(ageComparator))));
		
		youngestByClass.forEach((k, v) -> System.out.println("Class:" + k + " Age:"
				+ ((Optional<Student2>) v).get().getAge() + " Name:" + ((Optional<Student2>) v).get().getName()));
	}

}
