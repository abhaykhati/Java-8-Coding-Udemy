package java_8_code.stream.Terminal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class ThreeArgumentGruoupinByExample {
	
	public static void threeGroupingBy() {
		
		Map<String, Set<Student>> threeGroupingBy = StudentDataBase.getAllStudents()
				.stream()
                .collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new, Collectors.toSet()));
		
		System.out.println(threeGroupingBy);
	}
    public  static void twoLevelGrouping_3(){



        Map<String,Set<Student>> nameNoteBooksMap = StudentDataBase.getAllStudents().stream()

                .collect(Collectors.groupingBy(Student::getName,

                		Collectors.toSet()));// second argument can be of any type of collector



        System.out.println(nameNoteBooksMap);

    }
	



	public static void main(String[] args) {
		
	}

}
