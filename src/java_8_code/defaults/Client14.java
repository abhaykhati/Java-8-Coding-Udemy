package java_8_code.defaults;

public class Client14 implements Interface1, Interface4 {

	@Override
	public void methodA() {
		// if you have similar method in both interfaces
		// then implementation class must override that
		// similar method in implementation class like methodA()

		// Interface4.super.methodA();
		//output: Inside method A interface java_8_code.defaults.Interface4
		// either reference an interface directly or provide a self implementation like
		// below

		System.out.println("method A from Client14");
	}

	public static void main(String[] args) {
		Client14 c = new Client14();
		c.methodA();
	}

}
