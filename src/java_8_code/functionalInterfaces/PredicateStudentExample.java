package java_8_code.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> studentGradeLevelPredicate = stu -> stu.getGradeLevel() > 4;// changed (2 to 4) for filterStudentByAndOrCondition()
	static Predicate<Student> studentGpaPredicate = stu -> stu.getGpa() >= 5.0;

	public static void filterStudentByGradeLevel() {

		System.out.println("   filterStudentByGradeLevel");
		System.out.println();

		List<Student> allStudentsList = StudentDataBase.getAllStudents();

		/*
		 * //old way of fetching data before java 8 
		 * 
		 * for(Student student:allStudentsList) { if(student.getGradeLevel()>3)
		 * System.out.println(student); }
		 */

		// using java 8 predicate
		allStudentsList.forEach(student -> {
			if (studentGradeLevelPredicate.test(student)) {
				System.out.println(student);
			}
		});
		System.out.println("no results found for Grade Level");

	}

	public static void filterStudentByGpa() {

		System.out.println("  filterStudentByGpa");
		System.out.println();

		List<Student> allStudentsList = StudentDataBase.getAllStudents();

		// using java 8 predicate
		allStudentsList.forEach(student -> {
			if (studentGpaPredicate.test(student)) {
				System.out.println(student);
			}
		}
		);
	}

	public static void filterStudentByAndOrCondition() {

		System.out.println(" filterStudentByAndOrCondition");
		System.out.println();

		List<Student> allStudentsList = StudentDataBase.getAllStudents();

		// using java 8 predicate
		allStudentsList.forEach(student -> {
			if (studentGpaPredicate.or(studentGradeLevelPredicate).test(student)) {
				System.out.println(student);
			}
		}
		);
		
	}

	public static void main(String[] args) {

		filterStudentByGradeLevel();

		System.out.println();

		filterStudentByGpa();

		System.out.println();

		filterStudentByAndOrCondition();
	}
}
