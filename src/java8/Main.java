package java8;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		long uniqueWords = 0;
		try(Stream<String> lines =
		Files.lines(Paths.get("c:/hello.txt"), Charset.defaultCharset())){
		uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
		.distinct()
		.count();
		}
		catch(IOException e){
		}
		System.out.println(uniqueWords);
	}
}
