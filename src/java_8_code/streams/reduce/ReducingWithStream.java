package java_8_code.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingWithStream {

	static class Employee {

		private String name;
		private Integer age;
		private Double salary;

		public Employee(String name, Integer age, Double salary) {
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public String getName() {
			return this.name;
		}

		public Integer getAge() {
			return this.age;
		}

		public Double getSalary() {
			return this.salary;
		}

		// overridden equals() and hashcode() go here
		public String toString() {
			return "Employee Name: " + this.name + "  Age: " + this.age + "  Salary: " + this.salary;
		}
	}// employee closed

	static List<Employee> employeeList = Arrays.asList(
			new Employee("Tom Jones", 45, 7000.00),
			new Employee("Harry Major", 25, 10000.00),
			new Employee("Ethan Hardy", 65, 8000.00),
			new Employee("Nancy Smith", 22, 12000.00),
			new Employee("Deborah Sprightly", 29, 9000.00));

	public static void main(String[] args) {

		/*
		 * Double totalSalaryExpense = employeeList
		 * 
		 * .stream()
		 * 
		 * .map(emp -> emp.getSalary()).reduce(0.00, (a, b) -> a + b);
		 * 
		 * System.out.println("Total salary expense: " + totalSalaryExpense);
		 */

		
		Optional<Employee> maxSalaryEmp=employeeList
				.stream()
			    .reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b:a);
		
			if(maxSalaryEmp.isPresent())
				
			  System.out.println("Employee with max salary: "+maxSalaryEmp.get());
			
	}
}
