package java_8_code.methodReference;

import java.util.function.Consumer;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class ConsumerMethodReferenceExample {
	

	static Consumer<Student> allStudentConsumer=System.out::println;// to print all students using method reference
	static Consumer<Student> studentActivitiesConsumer=Student::printListOfActivities;// using method reference to print Activities
    //static Consumer<Student> c2 = (student -> student.printListOfActivities()); //using lambda
	
	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(allStudentConsumer);
		StudentDataBase.getAllStudents().forEach(studentActivitiesConsumer);
		
		
		
	}

}
