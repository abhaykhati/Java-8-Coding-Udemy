 package java_8_code.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
	
	
	public static Optional<String> ofNullable(){
		
		return Optional.ofNullable("Hello AK");
	}
	
	public static Optional<String> of() {
		
		return Optional.of("hello vik");
		
	}
	
	public static Optional<String> empty(){
		
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		
		Optional<String> ofNullable = ofNullable();
		boolean present = ofNullable.isPresent();
		if (present) {
			System.out.println("ofNullable()=  "+ofNullable.get());
			
		}
		
		Optional<String> of = of();
		boolean present2 = of.isPresent();
		if (present2) {
			System.out.println("of()=  "+present2);
			
		}
		
		
		 System.out.println("empty=  "+ empty());
		
		
	}

}
