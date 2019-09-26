package java_8_code.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	Predicate<Student> studentGradePredicate=s -> s.getGradeLevel() >=5;
	Predicate<Student> studentGpaPredicate=s -> s.getGpa() > 7;
	
	BiConsumer<String, List<String>> studentNameActivitiesBiConsumer= (name,Activities)-> System.out.println("Name=  "+ name+"  Activities= "+Activities);
	
	Consumer<Student> studentConsumer= student -> {
		if(studentGradePredicate.and(studentGpaPredicate).test(student)) {
			studentNameActivitiesBiConsumer.accept(student.getName(), student.getActivities());
		}
	};
	
	public void printNameAndActivities(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<Student> allStudentsList = StudentDataBase.getAllStudents();
		
		new PredicateAndConsumerExample().printNameAndActivities(allStudentsList);
		
	}

}
