package java_8_code.streams;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamsListSetExample {

	public static List<String> getStudentsNameAsList() {

		List<String> allStudentsList = StudentDataBase.getAllStudents().parallelStream() // Stream <Student>
				.map(Student::getName) // Stream <String>
				.map(String::toUpperCase) // Stream <String> -> performing UPPERCASE operation for each input
				.collect(Collectors.toList());// .collect() is a terminal operation because it produces a result and return 
											  // a collection

		return allStudentsList;
	}

	public static Set<String> getStudentsNameAsSet() {

		Set<String> allStudentSet = StudentDataBase.getAllStudents().parallelStream() // Stream <Student>
				.map(Student::getName) // Stream <String>
				.map(String::toUpperCase) // Stream <String> -> performing UPPERCASE operation for each input
				.collect(Collectors.toSet());// .collect() is a terminal operation because it produces a result and return 
											 // a collection

		return allStudentSet;
	}

	public static Set<String> getGenderStudent() {

		Predicate<Student> studentGenderPredicate = s -> s.getGender().startsWith("f");

		Set<String> allStudentsList = StudentDataBase.getAllStudents().parallelStream() // Stream <Student>
				.filter(studentGenderPredicate)
				.map(Student::getName) // Stream <String>
				.map(String::toUpperCase) // Stream <String> -> performing UPPERCASE operation for each input
				.collect(Collectors.toSet());// .collect() is a terminal operation because it produces a

		return allStudentsList;
	}
	

	public static void main(String[] args) {

		System.out.println("As List=  " + getStudentsNameAsList());

		System.out.println();

		System.out.println("Female GenderStudent=  " + getGenderStudent());
		
		System.out.println();
		
		System.out.println("As Set=   "+ getStudentsNameAsSet());

	}
}
