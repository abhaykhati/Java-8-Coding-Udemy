package java_8_code.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExamples {
	

	public static void main(String[] args) {
		
		class Person {
			String name;
			int age;
			public Person(String name, int age){
				this.name=name;
				this.age=age;
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
			@Override
			public String toString(){
				return "Person Name: "+name+", Age: "+age;
			}
		}
		
		
		BiPredicate<Person,Integer> isPersonAgeValid = (person,ageLimit)->{
			if(person!=null){
				if(person.getAge()<=ageLimit){
					return true;
				}
			}
			return false;
		};
		
		int inputAgeLimit = 59;
		
		Person personObject1 = new Person("Tom",68);
		System.out.println("Is "+personObject1.getName()+"'s Age valid? "+isPersonAgeValid.test(personObject1, inputAgeLimit));
		
		Person personObject2 = new Person("Mary",40);
		System.out.println("Is "+personObject2.getName()+"'s Age valid? "+isPersonAgeValid.test(personObject2, inputAgeLimit));
		
		Person personObject3 = new Person("Mike",51);
		System.out.println("Is "+personObject3.getName()+"'s Age valid? "+isPersonAgeValid.test(personObject3, inputAgeLimit));
		
	    Person personObject4 = new Person("Larry",35);
		System.out.println("Is "+personObject4.getName()+"'s Age valid? "+isPersonAgeValid.test(personObject4, inputAgeLimit));
		
	}

}
