package java_8_code.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class SupplierInterfaceExample {

	public static void main(String[] args) {

		Supplier<Integer> supplier1=()-> 5*5;
		System.out.println("supplier1=  "+ supplier1.get());
		
		Supplier<Student> studentSupplier=()-> {
			return new Student ("Gopal",5,8.9,"male", 22,Arrays.asList("bevkufgiri", "phoknad","cricket","oversmart"));
		};
		
		System.out.println("studentSupplier=  "+studentSupplier.get());
		
		Supplier<List<Student>> studentListSupplier=()-> StudentDataBase.getAllStudents();
		
		System.out.println("studentListSupplier=  "+studentListSupplier.get());
	}

}
