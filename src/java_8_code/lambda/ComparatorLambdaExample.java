package java_8_code.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		// prior to java 8 comparator
		Comparator<Integer> comparator=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(02);// if (o1==o2) return 0; if(o1 < o2) return -1; if(o1 > o2) return 1;
			}
		};
		System.out.println("Comparator Result is = "+ comparator.compare(3, 2));
		
		
		// with java 8 LAMBDA with type inference 
		
		Comparator<Integer> comparatorLambda= (o1,o2) -> {// lambda using type inference (o1,o2)
			return o1.compareTo(o2);
		};
		System.out.println("comaprator lambda=  "+ comparatorLambda.compare(2, 5) ); //
	}// main closed
	

}
