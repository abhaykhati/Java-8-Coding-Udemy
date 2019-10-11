package java_8_code.stream.Terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class StreamGoupingByExample {
	
	 public static Map<String, List<Student>>  groupingByStudentGender() {
		 
		 Map<String, List<Student>> studentsGenderGrouping = StudentDataBase.getAllStudents()
		 				.stream()
		 				.collect(Collectors.groupingBy(Student::getGender));
		 return studentsGenderGrouping;
	 }
	 
	 public static Map<String, List<Student>> customizedGpaGroupingBy() {
		 
		 Map<String, List<Student>> studentGapGrouping = StudentDataBase.getAllStudents()
		 				.stream()
		 				.collect(Collectors.groupingBy(stud -> stud.getGpa()>=5? "OUTSTANDING":"AVERAGE"));
		 return studentGapGrouping;
	 }
	
	
	public static void main(String[] args) {
		
		
		/*   old way of iterating a Map before JAVA 8
		 * Set<Entry<String, List<Student>>> entrySet = customizedGpaGroupingBy().entrySet();
		for (Entry<String, List<Student>> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			List<Student> value = entry.getValue();
			for(Student s:value) {
				System.out.print(s.getName());
				System.out.println("  GPA= "+s.getGpa());
			}
			
		}
		output:
 		AVERAGE=[
		Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball]},
	    Student{name='Jenny', gradeLevel=2, gpa=1.8, gender='female', activities=[swimming, gymnastics, soccer]}, 
	    Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}, 
	    Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}, 
	    Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball, football]}],
	     
	    OUTSTANDING=[
	    Student{name='Dave', gradeLevel=3, gpa=6.0, gender='male', activities=[swimming, gymnastics, soccer]}, 
	    Student{name='Viccky', gradeLevel=6, gpa=7.0, gender='male', activities=[chutyapa, hullad, baseball, kabbadi]}, 
	    Student{name='Gopal', gradeLevel=5, gpa=8.9, gender='male', activities=[bevkufgiri, phoknad, cricket, oversmart]}, 
	    Student{name='Vijay', gradeLevel=8, gpa=5.5, gender='male', activities=[chutyapa, hullad, baseball, kabaddi]}
		*/
		
		// Since java 8 new way to iterate map
		customizedGpaGroupingBy().forEach((x, y) -> {
								  System.out.println(x + "  ");
								  y.forEach(a -> 
								  System.out.println("name= " + a.getName() + " gpa=" + a.getGpa()));
								  //System.out.println(a));
		});
		
		/* output: to remove square brackets and for clean output
		 * AVERAGE  
		name= Adam gpa=3.6
		name= Jenny gpa=1.8
		name= Emily gpa=4.0
		name= Sophia gpa=3.5
		name= James gpa=3.9
		OUTSTANDING  
		name= Dave gpa=6.0
		name= Viccky gpa=7.0
		name= Gopal gpa=8.9
		name= Vijay gpa=5.5
		*/
		

		
		
	/*	Map<String, List<Student>> groupingByStudentGender = groupingByStudentGender();
		
		groupingByStudentGender.forEach((x,y)-> {
			System.out.print("Gender= "+x);
			System.out.println();
			//System.out.println("Student Name= "+y);
			y.forEach(a-> System.out.println(a));
			
		});*/
		
		//groupingByStudentGender.entrySet().forEach(entry->System.out.println("key=  "+entry.getKey()+"   Value=  "+entry.getValue()));
		
		/*
			 * Set<Entry<String, List<Student>>> entrySet = groupingByStudentGender.entrySet();
			for (Entry<String, List<Student>> entry : entrySet) {
			
			String key = entry.getKey();
			System.out.println("key=  "+key);
			
			List<Student> value=entry.getValue();
			System.out.println("value= "+value);
		*/
			
			
		}
		
	}

