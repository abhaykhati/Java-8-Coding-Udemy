package java_8_code.stream.Terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamGroupingByMultiLevelExample {

	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping() {

		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()

				.collect(Collectors.groupingBy(Student::getGradeLevel,

						Collectors.groupingBy(student -> student.getGpa() >= 5 ? "OUTSTANDING" : "AVERAGE")));

	//	Stream.of(studentMap).forEach(System.out::println);
		return studentMap;
	}
	
	public static Map<String, Integer> groupingStudentsNotebook() {

		Map<String, Integer> studentNotebookMap = StudentDataBase.getAllStudents()
												 .stream()
												 .collect(Collectors.groupingBy(Student::getName,
														 Collectors.summingInt(Student::getNoteBooks)));

		return studentNotebookMap;
	}

	public static void main(String[] args) {
		/*Map<Integer, Map<String, List<Student>>> twoLevelGrouping = twoLevelGrouping();
		
		twoLevelGrouping.forEach(
				(x,y) -> {
					System.out.println(x);
					
					y.forEach((a,b)->{
						System.out.println(a);
						System.out.println(b);
						
						
					});
				}
				);*/
		
		Map<String, Integer> groupingStudentsNotebook = groupingStudentsNotebook();
		//System.out.println(groupingStudentsNotebook);
		
		groupingStudentsNotebook.forEach((a,b)->{
			System.out.print("Name= "+ a  +" have ");
			System.out.println(b +"  notebooks");
			
			
		
		});
		
		
				
		
		
		
		
		
		
		
		
		
	}

}
