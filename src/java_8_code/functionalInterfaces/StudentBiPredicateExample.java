package java_8_code.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StudentBiPredicateExample {

	/*
	 * Predicate<Student> studentGradeLevelPredicate=stu -> stu.getGradeLevel() > 5;
	 * 
	 * Predicate<Student> studentGpaPredicate=stu -> stu.getGpa() > 6;
	 */

	BiPredicate<Integer, Double> studentBiPredicate = (gradeLevel, gpa) -> gradeLevel >= 5 && gpa > 6;

	BiConsumer<String, List<String>> studentNameAndActivitiesBiConsumer = (name, activities) -> {
		System.out.println("name=  " + name + "  activities= " + activities);
	};

	/*
	 * Consumer<Student> studentConsumer= student -> {
	 * if(studentGradeLevelPredicate.and(studentGpaPredicate).test(student)) {
	 * studentNameAndActivitiesBiConsumer.accept(student.getName(),
	 * student.getActivities()); } };
	 */
	
	Consumer<Student>studentConsumer= student -> {
		if (studentBiPredicate.test(student.getGradeLevel(),  student.getGpa())) {
			studentNameAndActivitiesBiConsumer.accept(student.getName(), student.getActivities());
			
			
		}
	};

	private void printStudentNameAndActivities(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}

	public static void main(String[] args) {

		List<Student> allStudentsList = StudentDataBase.getAllStudents();

		new StudentBiPredicateExample().printStudentNameAndActivities(allStudentsList);

	}

}
