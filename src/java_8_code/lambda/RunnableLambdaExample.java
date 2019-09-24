package java_8_code.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		// prior Java 8 
		Runnable runnable= new Runnable() {
			
			@Override
			public void run() {

				System.out.println("inside Runnable 1");
			}
		};
		new Thread(runnable).start();
		
		// with Java 8 LAMBDA
		
			Runnable runnableLambda=() -> System.out.println("inside runnable with lambda");// single line lambda
			
			Runnable multilineLambda=() -> {
			 System.out.println("Multiline lambda");
			 };// Multiple line lambda
		
		
		new Thread(runnableLambda).start();
		new Thread(multilineLambda).start();
	}

	
	
}
