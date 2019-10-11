package java_8_code.stream.Terminal;

import java.util.stream.Collectors;

import java_8_code.data.StudentDataBase;

public class StreamCountingExample {
	
	public static long count() {
		Long collectCount = StudentDataBase.getAllStudents()
		.stream()
		.filter(stu -> stu.getGender().equals("female"))
		.collect(Collectors.counting());
		return collectCount;
	}
	
	
	public static void main(String[] args) {
		System.out.println("femail student count=  "+ count());
		
	}

}
