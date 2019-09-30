package java_8_code.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class BiFunctionalStudentExample {

	public static BiFunction<List<java_8_code.data.Student>, Predicate<Student>, Map<String, Double>> studentBiFunction = 
			(students,studentPredicate) -> {
		Map<String, Double> studentGpaMap = new HashMap<String, Double>();
		students.forEach(student -> {
			
			if(studentPredicate.test(student)) {
				studentGpaMap.put(student.getName(), student.getGpa());
				
			}
		});

		return studentGpaMap;
	};

	public static void main(String[] args) {
		
		System.out.println(studentBiFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.studentGpaPredicate));

	}

}
