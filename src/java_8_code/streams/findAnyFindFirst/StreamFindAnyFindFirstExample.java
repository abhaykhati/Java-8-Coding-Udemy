package java_8_code.streams.findAnyFindFirst;

import java.util.Optional;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamFindAnyFindFirstExample {

	public static Optional<Student> findAny() {

		return StudentDataBase.getAllStudents().stream()

				.filter(student -> student.getGpa() >= 8)

				.findAny();

	}

	public static Optional<Student> findFirst() {

		return StudentDataBase.getAllStudents().stream()

				.filter(student -> student.getGpa() >= 7.0)

				.findFirst();

	}

	public static void main(String[] args) {

		Optional<Student> findAnyStudent = findAny();

		if (findAnyStudent.isPresent()) {

			System.out.println("findAny Student is :" + findAnyStudent.get());

		} else {

			System.out.println("No Student Found");

		}

		Optional<Student> findFirst = findFirst();

		if (findFirst.isPresent()) {

			System.out.println(" findFirst Student is :" + findFirst.get());

		} else {

			System.out.println("No Student Found");

		}

		// it will make a lot of different during parallel stream

	}

}
