package Lambda;

import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String[] args){
//		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//		for (Integer cost : costBeforeTax) {
//		    double price = cost + .12*cost;
//		    System.out.println(price);
//		}
		 
		// 使用lambda表达式
		List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
//		costBeforeTax1.stream()
//					.map( 
//							(cost) -> cost + .12*cost
//						)
//					.forEach(System.out::println);
		
		costBeforeTax1.stream()
		.map(  
				(num)->num+1
			)
		.forEach(System.out::println);
	}    
}