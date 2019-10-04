package java_8_code.streams.streamComparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamCompartorExample {

	public static List<Student> printStudentNamesASC() {

		List<Student> studentList = StudentDataBase.getAllStudents()
								    .stream()
								    .sorted(Comparator.comparing(Student::getName))
								    .collect(Collectors.toList());

		return studentList;
	}

	public static List<Student> printStudentByGradeLevelDESC() {

		List<Student> studentList = StudentDataBase.getAllStudents()
								    .stream()
								    .sorted(Comparator.comparing(Student::getGradeLevel).reversed())
								    .collect(Collectors.toList());

		return studentList;
	}

	public static void main(String[] args) {

		System.out.println("Students Name by ASC order");
		List<Student> printStudentNamesASC = printStudentNamesASC();
		printStudentNamesASC.forEach(System.out::println);
		//printStudentNamesASC.forEach(System.out::println);
		// printStudentNamesASC.forEach(stu -> System.out.println(stu));

		System.out.println();
		System.out.println("Sort student by GradeLevel DESC");
		
		List<Student> printStudentByGradeLevelDESC = printStudentByGradeLevelDESC();
		printStudentByGradeLevelDESC.forEach(System.out::println);

	}

}
