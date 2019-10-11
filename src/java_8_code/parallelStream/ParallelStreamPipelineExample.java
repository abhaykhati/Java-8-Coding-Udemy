package java_8_code.parallelStream;

import java.util.List;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class ParallelStreamPipelineExample {

	public static List<String> sequentialStream() {

		long start = System.currentTimeMillis();

		List<String> studentActivities = StudentDataBase.getAllStudents()

				.stream()
				
				.map(Student::getActivities) // Stream<List<String>>
				
				.flatMap(List::stream) // <Stream<String>
				
				.collect(Collectors.toList());

		long duration = System.currentTimeMillis() - start;

		System.out.println("Duration in sequential stream : " + duration);

		return studentActivities;

	}
	
	public static List<String> parallelStream() {

		long start = System.currentTimeMillis();

		List<String> studentActivities = StudentDataBase.getAllStudents()

				.parallelStream()

				.map(Student::getActivities) // Stream<List<String>>

				.flatMap(List::stream) // <Stream<String>

				.collect(Collectors.toList());

		long duration = System.currentTimeMillis() - start;

		System.out.println("Duration in parallel stream : " + duration);

		return studentActivities;

	}

	public static void main(String[] args) {

		System.out.println("sequentialStream : " + sequentialStream());

		System.out.println("parallelStream : " + parallelStream());

	}

}
