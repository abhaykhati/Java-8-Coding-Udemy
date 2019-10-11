package java_8_code.stream.Terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamsPartitioningExample {

	public static void partitioningBy_1() {

		Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.8;

		Map<Boolean, List<Student>> studentMap = 
				StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.partitioningBy(gpaPredicate));

		System.out.println("studentMap : " + studentMap);

	}

	public static void partitioningBy_2() {

		Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.8;

		Map<Boolean, Set<Student>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));

		System.out.println("studentMap : " + studentMap);

	}

	public static void partitioningBy_3() {

		Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 3.8;

		Map<Boolean, Map<String, List<String>>> studentMap = 
				StudentDataBase.getAllStudents()
				.stream()
				.collect(
				Collectors.partitioningBy(gpaPredicate,Collectors.toMap(Student::getName, Student::getActivities)));

		System.out.println("studentMap : " + studentMap);

	}
	
	public static void main(String[] args) {
		partitioningBy_1();

		partitioningBy_2();

		partitioningBy_3();
	}

}
