package java_8_code.streams.filter;

import java.util.List;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamFilterExample {

	
	public static List<Student> printFilteredStudentByGenderAndGpa(){
		
		List<Student> filteredStudentsList = StudentDataBase.getAllStudents()
									.stream()
									.filter(student -> student.getGender().equals("male"))
									.filter(stu -> stu.getGpa() > 5.0)
									.collect(Collectors.toList());
		return filteredStudentsList;
		
	}
	
	public static void main(String[] args) {
		
		
		List<Student> printFilteredStudentByGenderAndGpa = printFilteredStudentByGenderAndGpa();
		printFilteredStudentByGenderAndGpa.forEach(System.out::println);
	}
}
