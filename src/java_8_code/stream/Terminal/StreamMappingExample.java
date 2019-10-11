package java_8_code.stream.Terminal;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamMappingExample {
	

	public static void main(String[] args) {

		/*
		 * List<String> StudentList = StudentDataBase.getAllStudents() .stream()
		 * .collect(Collectors.mapping(Student::getName, Collectors.toList()));
		 * StudentList.forEach(stu -> System.out.println(stu));
		 * 
		 * System.out.println(); System.out.println("Student Set");
		 * 
		 * Set<String> StudentSet = StudentDataBase.getAllStudents() .stream()
		 * .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		 * StudentSet.forEach(stu -> System.out.println(stu)); System.out.println();
		 */
		System.out.println("Student via map() ");
		
		List<Student> allStudents = StudentDataBase.getAllStudents()
									.stream()
									.sorted(Comparator.comparing(a -> a.getName()))
								//	.sorted(Comparator.comparing(Student::getName))
									.collect(Collectors.toList());
			allStudents.forEach(a-> System.out.println(a));

	}

}
