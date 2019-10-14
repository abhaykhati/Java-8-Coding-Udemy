package java_8_code.defaults;

public interface Interface2 extends Interface1 {
	
	void doNothing2();

	default void methodB() {

		System.out.println("Inside method B");

	}

	default void methodA() {

		System.out.println("Inside method A " + Interface2.class);

	}
}
