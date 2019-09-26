package java_8_code.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
// URL : https://thejavacult.com/bipredicate-interface-java-util-function/

/*	Suppose we have the following three conditions to test for a Student object:
	1)	Does the student pass both Maths and Science?
	2)	Does he pass at least one of the two?
	3)	Lastly, does the student fail Maths?
*/

class Subject {
	String name;
	double marks;

	public Subject(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Subject Name: " + name + ", Marks: " + marks;
	}
}

class Student {
	String name;
	List<Subject> subjects;

	public Student(String name, List<Subject> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Person Name: " + name + ", Subjects: " + subjects;
	}
}// Student class closed

public class BiPredicateStudentSubjectDemo {

	public static void main(String[] args) {
		/*
		 * 1) Does the student pass Maths?
		 */
		BiPredicate<Student, Double> doesStudentPassMaths = (person, passMarks) -> {
			if (person != null && person.getSubjects() != null && !person.getSubjects().isEmpty()) {
				for (Subject subject : person.getSubjects()) {
					if (subject.getName().equals("Maths")) {
						if (subject.getMarks() >= passMarks) {
							return true;
						}
					}
				}
			}
			return false;
		};
		/*
		 * Suppose we have the following three conditions to test for a Student object:
		 * 1) Does the student pass Science?
		 */
		BiPredicate<Student, Double> doesStudentPassScience = (person, passMarks) -> {
			if (person != null && person.getSubjects() != null && !person.getSubjects().isEmpty()) {
				for (Subject subject : person.getSubjects()) {
					if (subject.getName().equals("Science")) {
						if (subject.getMarks() >= passMarks) {
							return true;
						}
					}
				}
			}
			return false;
		};

		double inputPassMarks = 49;
		// check if student passes both Maths & Science
		BiPredicate<Student, Double> bothPass = doesStudentPassMaths.and(doesStudentPassScience);

		// check if student passes at least one of Maths & Science
		BiPredicate<Student, Double> atleastOnePass = doesStudentPassMaths.or(doesStudentPassScience);

		// check if student fails Maths
		BiPredicate<Student, Double> doesStudentFailMaths = doesStudentPassMaths.negate();

		List<Subject> subjectsList = new ArrayList<Subject>();
		subjectsList.add(new Subject("Maths", 38));
		subjectsList.add(new Subject("Science", 80.9));
		subjectsList.add(new Subject("History", 45));

		Student student = new Student("Tom", subjectsList);

		System.out.println("Does Student Pass both subjects? " + bothPass.test(student, inputPassMarks));
		System.out.println("Does Student Pass at least one subject? " + atleastOnePass.test(student, inputPassMarks));
		System.out.println("Does Student Fail Maths? " + doesStudentFailMaths.test(student, inputPassMarks));

	}

}
