package java_8_code.streams.flatMap;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapWithFile {

	public static void main(String[] args) {
		Stream<String> lines = null;
		try {
			lines = Files.lines(Paths.get("E:/info.txt"), StandardCharsets.UTF_8);

			} catch (IOException e) {
			e.printStackTrace();
		}
		
		Stream<String> stream = lines.flatMap(line -> Stream.of(line.split(" +")));
		
		List<String> words = new ArrayList<>();
		
		stream.forEach(w -> words.add(w));
		words.forEach(w -> System.out.println(w));
	}

}
