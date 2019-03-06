package Lambda;

import java.util.Arrays;
import java.util.List;

public class Test6 {
	public static void main(String[] args){
		  final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
	        final Integer sum = numbers.stream()
	                .reduce(0, (a, b) -> a + b);
	        System.out.println(sum);
	        
//	        Callable<String> c = () -> "done";
//
//	        PrivilegedAction<String> a = () -> "done";
	}    
}