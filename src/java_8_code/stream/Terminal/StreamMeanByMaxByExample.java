package java_8_code.stream.Terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamMeanByMaxByExample {

	public static void main(String[] args) {

		System.out.println("studentGpaMinBy");
		Optional<Student> studentGpaMinBy = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
		
		studentGpaMinBy.ifPresent(stu -> {
			stu.getName();
			System.out.print("Student Name= " + stu.getName() + "  ");
			System.out.println("Student GPA=" + stu.getGpa());

		});

		System.out.println();
		System.out.println("studentGpaMaxBy");

		Optional<Student> studentGpaMaxBy = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
		
		studentGpaMaxBy.ifPresent(stu -> {
			stu.getName();
			System.out.print("Student Name= " + stu.getName() + "  ");
			System.out.println("Student GPA=" + stu.getGpa());

		});

	}

}
