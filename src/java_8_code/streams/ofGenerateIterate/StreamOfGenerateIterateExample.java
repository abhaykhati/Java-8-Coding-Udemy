package java_8_code.streams.ofGenerateIterate;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {

		Stream<String> streamOf = Stream.of("abhay", "anand", "bhagyashree", "prachi", "anand").sorted().distinct();

		streamOf.forEach(a -> System.out.println("streamOf=  " + a));
		// streamOf.forEach(System.out::println);

		System.out.println();

		Stream.iterate(1, x -> x * 2).limit(5).forEach(System.out::println);

		System.out.println();

		//Stream<UUID> uuidStream = Stream.generate(UUID::randomUUID);
		//uuidStream.limit(10).distinct().forEach(System.out::println);
		
		//Stream.generate(new Random()::nextInt);
		
		Supplier<Integer> integerSupplier=new Random()::nextInt;
		Stream.generate(integerSupplier)
			  .limit(5)
			  //.forEachOrdered(System.out::println);
			  .forEach(a->System.out.println("Random Next Int= "+a));
								
		
		

	}
}
