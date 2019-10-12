package java_8_code.optional;

import java.util.Optional;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {

		// Student student = StudentDataBase.studentSupplier.get();

		Student student = null;

		if (student != null) {

			return student.getName();

		}
		return null;
	}

	public static Optional<String> getStudentNameOptional() {

		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		// Optional<Student> student = Optional.ofNullable(null);

		if (student.isPresent()) {

			return student.map(Student::getName); // don't get confused this with streams map method. Both are
													// different.
		}

		return Optional.empty();

	}

	public static void main(String[] args) {

		if (getStudentNameOptional().isPresent()) {

			System.out.println(getStudentNameOptional().get());

		} else {

			System.out.println("Name is returned as empty.");

		}

	}

}
