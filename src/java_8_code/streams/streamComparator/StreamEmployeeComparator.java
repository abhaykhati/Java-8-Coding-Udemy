package java_8_code.streams.streamComparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import java_8_code.data.Employee;

public class StreamEmployeeComparator {

	
	public static void main(String[] args) {
		
     List<Employee> employeesList = Employee.getEmployees();
    		   						 
       
   //   employeesList.sort(Comparator.comparing(Employee::getFirstName));;
     
     List<String> collect = employeesList.stream().map(Employee::getFirstName).distinct().sorted().collect(Collectors.toList());
     System.out.println(collect);
}
}
