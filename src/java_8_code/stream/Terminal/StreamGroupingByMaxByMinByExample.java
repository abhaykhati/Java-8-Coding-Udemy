package java_8_code.stream.Terminal;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamGroupingByMaxByMinByExample {

	public static void calculteTopGpaStudentinEachGrade() {

	/*	Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()

				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))

				));

		Stream.of(studentMapOptional).forEach(System.out::println);*/

		Map<Integer, Student> studentMap = StudentDataBase.getAllStudents().stream()

				.collect(Collectors.groupingBy(Student::getGradeLevel,

						Collectors
						.collectingAndThen(Collectors
						.maxBy(Comparator.comparingDouble(Student::getGpa))
						, Optional::get
						)));

		Stream.of(studentMap).forEach(System.out::println);

	}
	

    public  static void calculteleastGpaStudentinEachGrade(){



/*		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()

				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.minBy(Comparator.comparingDouble(Student::getGpa))

				));

		Stream.of(studentMapOptional).forEach(System.out::println);*/





        Map<Integer, Student> studentMap =  StudentDataBase.getAllStudents().stream()

                .collect(Collectors.groupingBy(Student::getGradeLevel,
                         Collectors.collectingAndThen(
                         Collectors.minBy(Comparator.comparingDouble(Student::getGpa)
                         ),
                         Optional::get
                        )));



        Stream.of(studentMap).forEach(System.out::println);

    }

	public static void main(String[] args) {
		//calculteTopGpaStudentinEachGrade();
		calculteleastGpaStudentinEachGrade();
	}

}
