package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String[] args){
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        final List<String> numberIndex = numbers.stream()
                .map(number -> "#" + number)
                .collect(Collectors.toList());
        System.out.println(numberIndex);
//        Supplier<Runnable> c = () -> () -> { System.out.println("hi"); };
	}    
}