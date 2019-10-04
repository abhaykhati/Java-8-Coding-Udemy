package java_8_code.streams.reduce;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamMapReduceExample {
	
	public static Integer noOfNotebooksOfMaleStudents() {
		
					Integer noOfNotebooks = StudentDataBase.getAllStudents()
					.stream()
					.filter(stu -> stu.getGradeLevel()>= 5)
					.filter(stu -> stu.getGender().equals("male"))
					.map(Student::getNoteBooks)
					//.reduce(0,(a,b)-> a+b);
					.reduce(0,Integer::sum);
				return noOfNotebooks;
	}
	
	public static void main(String[] args) {
		
		Integer notbookCount = noOfNotebooksOfMaleStudents();
		
		System.out.println("notbookCount= "+notbookCount);
		
		
		
		   
		
	}

}
