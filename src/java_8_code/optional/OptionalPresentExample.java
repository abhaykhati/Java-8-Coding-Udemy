package java_8_code.optional;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {

		Optional<String> stringOptional = Optional.ofNullable("Hello Optional");

		System.out.println(stringOptional.isPresent());

		stringOptional.ifPresent((s -> System.out.println("value using Consumer=   : " + s)));

	}
}
 