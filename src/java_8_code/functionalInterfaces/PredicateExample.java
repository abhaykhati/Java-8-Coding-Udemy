package java_8_code.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p1=i -> {return i %2 ==0;};
	static Predicate<Integer> p2=i ->  i %2 ==0;;
	static Predicate<Integer> p3=i ->  i %5 ==0;;
	
	public static void predicateAnd() {
		
		  System.out.println("Result in predicate And : " + p1.and(p2).test(10));//predicate chaining
		  System.out.println("Result in predicate And : " + p1.and(p2).test(9));//predicate chaining
	}
	public static void predicateOr() {
		
		  System.out.println("Result in predicate Or for (10) : " + p1.or(p2).test(10));//predicate chaining
		  System.out.println("Result in predicate Or for (8)  : " + p1.or(p3).test(8));//predicate chaining
	}
	
	public static void predicateNegate() {
		
		  //System.out.println("Result in predicate Negate for (10) : " + p1.or(p2).negate().test(10));//predicate chaining
		
		  System.out.println("Result in predicate Negate for (8)  : " + p1.or(p3).negate().test(8));//predicate chaining
		  //or operation for 8 is divisible by 2 (p1 Predicate) but not by 5 (p3 Predicate) returns true
		  //but negate() makes it false
	}
	
	public static void main(String[] args) {
		
		/*System.out.println("p1.test=   "+p1.test(4));
		System.out.println("p2.test=   "+p2.test(4));*/
		
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
