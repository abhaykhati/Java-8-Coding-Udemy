package java_8_code.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateEmployeeExample {
	
	public static void main(String[] args){ 
		 
		   Employee emp = new Employee(1,"Robert",35,"Manager");
		 
		   BiPredicate<Employee,String> biPredicate1 = ( x , y ) -> {
		                                                             if( x.getDesignation().equalsIgnoreCase(y)){
		                                                                 return true;
		                                                             }else{
		                                                                 return false;
		                                                             }};
		   // Example of test method
		   boolean result = biPredicate1.test(emp,"Manager");
		   System.out.println("biPredicate1.test(emp,Manager)=     "+result);
		 
		   // Example of negate method
		   boolean result3 = (biPredicate1.negate()).test(emp,"Manager");
		   System.out.println("biPredicate1.negate()).test(emp,Manager)=   "+result3);
		 
		   BiPredicate<Employee,String> biPredicate2 = ( x , y ) -> {
		                                                             if( x.getDesignation().equalsIgnoreCase(y)){
		                                                                 return true;
		                                                             }else{
		                                                                 return false;
		                                                             }};
		 
		   // Example of and method
		   boolean result1 = biPredicate1.and(biPredicate2).test(emp,"Manager");
		   System.out.println("biPredicate1.and(biPredicate2).test(emp,Manager)=  "+result1);
		 
		   // Example of or method
		   boolean result2 = biPredicate1.or(biPredicate2).test(emp,"General Manager");
		   System.out.println("biPredicate1.or(biPredicate2).test(emp,General Manager)=   "+result2);
		 
		}    	

}
class Employee {
	 
	   private long empId;
	   private String name;
	   private int age;
	   private String designation;
	 
	   public Employee(long empId, String name, int age, String designation) {
	     super();
	     this.empId = empId;
	     this.name = name;
	     this.age = age;
	     this.designation = designation;
	   }
	 
	   public long getEmpId() {
	     return empId;
	   }
	   public void setEmpId(long empId) {
	     this.empId = empId;
	   }
	   public String getName() {
	     return name;
	   }
	   public void setName(String name) {
	     this.name = name;
	   }
	   public int getAge() {
	     return age;
	   }
	   public void setAge(int age) {
	     this.age = age;
	   }
	   public String getDesignation() {
	     return designation;
	   }
	   public void setDesignation(String designation) {
	     this.designation = designation;
	   }
	 
	}