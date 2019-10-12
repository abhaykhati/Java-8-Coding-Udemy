package java_8_code.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
        return  new Student("Victor",7,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    public static Optional<Student> getOptionalStudent(){

        Student student = new Student("vishal",2,4.0,"male", Arrays.asList("hiking", "basketball","volleyball"));

        Bike bike = new Bike("Suzuki", "kawasaki motors");
        student.setBike(Optional.of(bike));
        return Optional.of(student);
    }


    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,1.8,"female", 11,Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", 5,Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,6.0,"male", 15,Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female",7, Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male", 22,Arrays.asList("swimming", "basketball","baseball","football"));
        
          /*5th grade students*/
        Student student7 = new Student("Viccky",6,7.0,"male", 5,Arrays.asList("chutyapa", "hullad","baseball","kabbadi"));
        Student student9 = new Student("Vijay",8,5.5,"male", 4,Arrays.asList("chutyapa", "hullad","baseball","kabbadi"));
        Student student8 = new Student("Gopal",5,8.9,"male", 2,Arrays.asList("bevkufgiri", "phoknad","cricket","oversmart"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9);
        return students;
    }
}