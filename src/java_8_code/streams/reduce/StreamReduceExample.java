package java_8_code.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamReduceExample {
	
	public static int performMultiplication(List<Integer> integers) {
		
		return integers.stream()
				//1
				//3
				//5
				//7
				//a=1 b=1 (from Stream) -> result 1 is returned
				//a=1 b=3 (from Stream) -> result 3 is returned
				//a=3 b=5 (from Stream) -> result 15 is returned
				//a=15 b=7 (from Stream) -> result 105 is returned
				.reduce(1, (a,b)-> a*b);// with identity parameter as 1
	}
	
	public static  Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
		
		return integers.stream()
				//1
				//3
				//5
				//7
				//a=1 b=1 (from Stream) -> result 1 is returned
				//a=1 b=3 (from Stream) -> result 3 is returned
				//a=3 b=5 (from Stream) -> result 15 is returned
				//a=15 b=7 (from Stream) -> result 105 is returned
				.reduce((a,b)-> a*b); //without identity parameter it returns as Optional
	}
	 public static Optional<Student> getHighestGradeStudent(){

	        Optional<Student> studentOptional =  StudentDataBase.getAllStudents().stream()

	                .reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ? s1 : s2);

	        return studentOptional;

	    }
	


	public static void main(String[] args) {

		List<Integer> integers=Arrays.asList(1,3,5,7);
		
		System.out.println("Multiplication of Integers=  "+performMultiplication(integers));
		
		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		if (result.isPresent()) {
			System.out.println("Multiply Without Identity=  "+ result.get());
		}
		
		Optional<Student> highestGradeStudent = getHighestGradeStudent();
		if (highestGradeStudent.isPresent()) {
			System.out.println("Highest Grade Student=  "+highestGradeStudent.get());
			
		}
		
		
	}	

}
