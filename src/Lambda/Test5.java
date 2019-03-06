package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test5 {
	public static void main(String[] args){
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        final Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        	sum.orElseGet(() -> 0);
        	System.out.println(sum);
	}    
}