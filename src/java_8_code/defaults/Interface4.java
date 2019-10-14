package java_8_code.defaults;

public interface Interface4 {

	default void methodA() {
		// copied similar method from Interface1
		System.out.println("Inside method A  " + Interface4.class);

	}
}
