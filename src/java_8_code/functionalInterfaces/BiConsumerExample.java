package java_8_code.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class BiConsumerExample {

	public static void getNameAndActivities() {

		
		 BiConsumer<String, List<String>> studentBiconsumer=
		 (name, activities)->System.out.println("name=  "+ name.toUpperCase()+"   Activities= "+activities	);
		  
		// Consumer<String> stringConsumer = (name) -> System.out.println("name is  :" + name);
		 
		 List<Student> StudentsList = StudentDataBase.getAllStudents();
		  
		 StudentsList.forEach(student -> studentBiconsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a=  " + a + "   b=" + b);

		biConsumer.accept("hello", "byConsumer");

		BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiple=  " + (a * b));

		// multiply.accept(10, 5);

		BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("division=  " + (a / b));

		// division.accept(10, 5);

		multiply.andThen(division).accept(10, 2);
		getNameAndActivities();

	}

}
