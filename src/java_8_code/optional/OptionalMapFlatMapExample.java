package java_8_code.optional;

import java.util.Optional;

import java_8_code.data.Bike;
import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class OptionalMapFlatMapExample {

	public static void optionalFilter() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		studentOptional
		             .filter(stud -> stud.getGradeLevel() >= 5)
		             .ifPresent(s -> System.out.println("Filtered Student name=   " + s.getName() + "  gradeLevel= " + s.getGradeLevel()));
	}

	public static void optionalMap() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		if (studentOptional.isPresent()) {
			studentOptional.filter(stud -> stud.getGradeLevel() >= 5)
			.map(Student::getName);
			Student student = studentOptional.get();
			System.out.println("optional map student");
			System.out.println("name=  "+student.getName()+"  GradeLevel= "+student.getGradeLevel());

		}

	}
	
    public static void optionalFlatMap(){

        Optional<Student> studentOptional =  StudentDataBase.getOptionalStudent(); // return  Optional<Student>

        if(studentOptional.isPresent()){ // return boolean

            Optional<Bike> bikeOptional= studentOptional
            		.flatMap(Student::getBike) ;
            		//.map(Bike::getName);

          //  System.out.println("bikeOptional : " + bikeOptional.get());
            
           bikeOptional.ifPresent(s -> System.out.println("Bike Name=  "+s.getName()+"  Bike Model= "+s.getModel()));
        }

      }

	public static void main(String[] args) {
		optionalFilter();

		optionalMap();
		
		optionalFlatMap();

	}

}
