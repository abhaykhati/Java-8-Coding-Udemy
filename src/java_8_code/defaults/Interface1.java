package java_8_code.defaults;

public interface Interface1 {
	default void methodA() {

		System.out.println("Inside method A     " + Interface1.class);

	}
	
//	void doNothing1(); //commented for Client14.java 

}
