package java_8_code.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class DefaultMethodExample2 {

	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

	static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);

	static Comparator<Student> genderComparator = Comparator.comparing(Student::getGender);

	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

	static Consumer<Student> studentConsumer = stud -> System.out.println("student : " + stud);

	public static void sortByName(List<Student> studentList) {

		studentList.sort(Comparator.comparing(Student::getName)); // in line

		studentList.sort(nameComparator); // Using a reference

		System.out.println("After Sort BY Name : ");

		studentList.forEach(studentConsumer);

	}

	public static void sortByGPA(List<Student> studentList) {

		studentList.sort(gpaComparator);

		System.out.println("After Sort BY GPA : ");

		studentList.forEach(studentConsumer);

	}

	public static void sortByGender() {

		List<Student> studentList = StudentDataBase.getAllStudents();

	/*	Comparator<Student> nullFirst = Comparator.nullsFirst(genderComparator);*/// first it will print null value as nullFirst
		Comparator<Student> nullLast = Comparator.nullsLast(genderComparator);// it will print null value lastly as nullsLast

		studentList.sort(nullLast);

		System.out.println("After Sort By Gender : ");

		studentList.forEach(studentConsumer);

	}

	public static void comparatorChaining() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.sort(gradeComparator.thenComparing(nameComparator));

		System.out.println("Comparator Chaining List");

		studentList.forEach(studentConsumer);

	}

	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();

		System.out.println("Original List");

		studentList.forEach(student -> System.out.println("student : " + student));
		sortByGender();
		/*
		 * sortByGender();
		 * 
		 * sortByName(studentList);
		 * 
		 * sortByGPA(studentList);
		 */

		//comparatorChaining();

	}

}
