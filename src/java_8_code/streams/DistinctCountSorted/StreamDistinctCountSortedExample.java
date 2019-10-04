package java_8_code.streams.DistinctCountSorted;

import java.util.List;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamDistinctCountSortedExample {

	public static long printDistinctCountSortedStudentActivities() {

		long countOfStudentActivities = StudentDataBase.getAllStudents()
										.stream().map(Student::getActivities)
										.flatMap(List::stream)
										.distinct()
										.sorted()
										.count();

		return countOfStudentActivities;
	}

	public static List<String> printDistinctSortedStudentActivities() {

		List<String> listOfStudentActivities = StudentDataBase.getAllStudents()
										.stream()
										.map(Student::getActivities)
										.flatMap(List::stream)
										.distinct()
										.sorted()
										.collect(Collectors.toList());

		return listOfStudentActivities;
	}

	public static void main(String[] args) {
    
		
		System.out.println("count of student activities=  " + printDistinctCountSortedStudentActivities());
		
		System.out.println();
		List<String> printDistinctSortedStudentActivitiesList = printDistinctSortedStudentActivities();
		
		
		  	int count=0;
			for (String activities : printDistinctSortedStudentActivitiesList) {
			System.out.print(++count +"  ");
			System.out.println("Activities=  "+activities.toUpperCase());
			//System.out.println((++count)+" Activities=  "+ activities);
			//comment 2 added locally
			
		}
		
		
		//printDistinctSortedStudentActivitiesList.forEach(act -> System.out.println("  Student Activity= "+act));
		
		

	}

}
