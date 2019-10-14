package java_8_code.defaults;

public class Client123 implements Interface1, Interface2, Interface3 {

	public void methodA() { // overriding the default method in the implementation class.

		System.out.println("Inside method A " + Client123.class);

	}

	public static void main(String[] args) {

		Client123 client123 = new Client123();

		client123.methodA(); // resolves to child Interface Implementation

		//client123.methodB();

		//client123.methodC();

		/*whenever we are calling a overridden method  from subclass 
		 * 
		 * 1) it always calls a child implementation of it.
		 * 2) the sub interface that extends the interface.
		 * 
		 * 
		 * */
	}

	@Override
	public void doNothing3() {
		// non-default method needs to be implemented 
		
	}

	@Override
	public void doNothing2() {
		// non-default method needs to be implemented 		
	}

	// commented for Client14.java
/*	@Override
	public void doNothing1() {
		// non-default method needs to be implemented 		
	}*/

}
