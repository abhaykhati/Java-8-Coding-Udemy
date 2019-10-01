package java_8_code.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamsExample {

	private static Predicate<? super Student> studentGradeLevelPredicate = stud -> stud.getGradeLevel() >= 5;
	private static Predicate<? super Student> studentGpaPredicate = stud -> stud.getGpa() > 7;

	public static void main(String[] args) {

		Map<String, List<String>> studentNameAndActivitiesMap = 
				StudentDataBase.getAllStudents().parallelStream()
				.peek((student -> {
					System.out.println("all Students= "+student);
					System.out.println();
				}))
				.filter(studentGradeLevelPredicate)
				.peek((student -> { 
					System.out.println("afterGradeLevel Filter= "+student);
					System.out.println();
				}))
				.filter(studentGpaPredicate)
				.peek((student -> {
					System.out.println("after Gpa filter= "+student);
					System.out.println();
				}))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentNameAndActivitiesMap);

	}

}
