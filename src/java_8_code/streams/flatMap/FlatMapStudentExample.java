package java_8_code.streams.flatMap;

import java.util.List;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class FlatMapStudentExample {
	
	public static List<String>  getStudnetActivitiesViaFlatMap(){
		
		List<String> studentActivitiesFlatMap=
				   StudentDataBase.getAllStudents()
				   .stream()
				   .map(Student::getActivities)// Stream <List<String>>
				   .flatMap(List::stream)
				   .distinct()
				   .sorted()
				   .collect(Collectors.toList());
		return studentActivitiesFlatMap;
	}
	
	 
	
	public static void main(String[] args) {
		
		System.out.println(getStudnetActivitiesViaFlatMap());
		
	}

}
