package java_8_code.stream.Terminal;

import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamSumAvgExample {
	
	
	public static void main(String[] args) {
		
			Integer sumOfStudentsNotebook = StudentDataBase.getAllStudents()
						   .stream()
						   .collect(Collectors.summingInt(Student::getNoteBooks));
			System.out.println("sumOfStudentsNotebook= "+sumOfStudentsNotebook);
			
			Double avgOfStudentsGpa = StudentDataBase.getAllStudents()
					   .stream()
					   .collect(Collectors.averagingDouble(Student::getGpa));
		System.out.println("avgOfStudentsGpa= "+avgOfStudentsGpa);
						
	
		
		
	}

}
