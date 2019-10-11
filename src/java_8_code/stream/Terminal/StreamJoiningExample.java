package java_8_code.stream.Terminal;

import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamJoiningExample {
	
	public static String joining() {
		
			String joining1 = StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getName)
			.collect(java.util.stream.Collectors.joining());
			return joining1;								
	}
	
	public static String joiningWithDelimiter() {
			
			String joining2 = StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getName)
			.collect(Collectors.joining(" ** "));
			return joining2;
		}
	public static String joiningWithDelimiterWithPrefix() {
		
			String joining3 = StudentDataBase.getAllStudents()
			.stream()
			.map(Student::getName)
			.collect(Collectors.joining(" ## ", " [ ", "] "));
			return joining3;
	}
	public static void main(String[] args) {
		System.out.println(joining());
		
		System.out.println(joiningWithDelimiter());
		
		System.out.println(joiningWithDelimiterWithPrefix());
		
	}

}
