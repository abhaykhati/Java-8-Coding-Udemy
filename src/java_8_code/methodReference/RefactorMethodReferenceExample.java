package java_8_code.methodReference;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import java_8_code.data.Student;
import java_8_code.data.StudentDataBase;

public class RefactorMethodReferenceExample {


		static Predicate<Student> predicateUsingLambda = (s) -> s.getGradeLevel() >10;

		static Predicate<Student> predicateUsingMetRef = RefactorMethodReferenceExample::greaterThan;

		static BiPredicate<Student, Integer> predicateUsingMethodReference = RefactorMethodReferenceExample::greaterThan;

		static public boolean greaterThan(Student student) {

			return student.getGradeLevel() > 3;

		}

		static public boolean greaterThan(Student student, Integer grade) {

			return student.getGradeLevel() > grade;

		}

		public static void main(String[] args) {

			System.out.println(predicateUsingLambda.test(StudentDataBase.studentSupplier.get()));

			System.out.println(predicateUsingMetRef.test(StudentDataBase.studentSupplier.get()));

			System.out.println(predicateUsingMethodReference.test(StudentDataBase.studentSupplier.get(), 3));
		}

	}
