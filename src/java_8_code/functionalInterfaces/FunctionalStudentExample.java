package java_8_code.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class FunctionalStudentExample {

	static Function<List<Student>, Map<String, Double>> gpaStudentFunction = studentInpt -> {

		Map<String, Double> studentGradeMap = new HashMap<String, Double>();

		studentInpt.forEach(student -> {

			if (PredicateStudentExample.studentGradeLevelPredicate.test(student)) {

				studentGradeMap.put(student.getName(), student.getGpa());

			}
		});

		return studentGradeMap;
	};

	public static void main(String[] args) {

		System.out.println(FunctionalStudentExample.gpaStudentFunction.apply(StudentDataBase.getAllStudents()));

		/*
		 * Map<String, Double> apply =
		 * FunctionalStudentExample.gpaStudentFunction.apply(StudentDataBase.
		 * getAllStudents()); Set<Entry<String, Double>> entrySet = apply.entrySet();
		 * for (Entry<String, Double> entry : entrySet) { String name = entry.getKey();
		 * Double gpa= entry.getValue(); System.out.println("name=  "+ name
		 * +"  gpa= "+gpa);
		 * 
		 * }
		 */
	}

}
