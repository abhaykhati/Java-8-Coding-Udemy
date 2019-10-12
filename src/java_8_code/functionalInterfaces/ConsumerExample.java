package java_8_code.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c1 = p -> System.out.println(p);

	static Consumer<Student> c2 = p -> System.out.print(p.getName().toUpperCase());

	static Consumer<Student> c3 = p -> System.out.println(p.getActivities());

	public static void printName() { // prints all student data

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c1);

	}

	public static void printNameAndActivities() {
		
		/*
		   static Consumer<Student> c2 = p -> System.out.print(p.getName().toUpperCase());
		   static Consumer<Student> c3 = p -> System.out.println(p.getActivities());
		*/

		System.out.println("printNameAndActivities : ");

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c2.andThen(c3));

	}

	public static void printNameAndActivitiesUsingCondition() {
		
		/*
		 * static Consumer<Student> c2 = p -> System.out.print(p.getName().toUpperCase());
		   static Consumer<Student> c3 = p -> System.out.println(p.getActivities());
		*/

		System.out.println("printNameAndActivitiesUsingCondition : ");

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach((stud) -> {

			if (stud.getGradeLevel() >= 3 && stud.getGpa() > 3.9) {

				c2.andThen(c3).accept(stud);
			}

		});

	}

	public static void main(String[] args) {

		/*
		 * Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
		 * consumer.accept(
		 * "hello java 8 consumer which accepts the argument and performs some action on it and don't return a value"
		 * );
		 */
		//printName();
		printNameAndActivitiesUsingCondition();
	}

}
