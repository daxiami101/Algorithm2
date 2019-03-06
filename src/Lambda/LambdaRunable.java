package Lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaRunable {
	public static void main(String[] args) {
		// 不使用lambda表达式为每个订单加上12%的税
//		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//		for (Integer cost : costBeforeTax) {
//		    double price = cost + .12*cost;
//		    System.out.println(price);
//		}
		 
		// 使用lambda表达式
		List<Integer> list = Arrays.asList(100, 200, 300, 400, 500);
//		list.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
		

		list.stream().map((n)->n+2).forEach(System.out::println);
		
		double bill = list.stream()
						  .map((cost) -> cost + .12*cost)
						  .reduce((sum, cost) -> sum + cost)
						  .get();
		System.out.println("Total : " + bill);
		
//		bill=list.stream()
//			.map((i)->i+1)
//			.reduce((sum,i)->sum+i)
//			.get();
//		System.out.println("i:"+bill);
			
		// 创建一个字符串列表，每个字符串长度大于2
//		List<String>strList=Arrays.asList("aaa","bb","c");
//		List<String> filtered = 
//				strList.stream()
//				 	   .filter(x -> x.length()< 2)
//				 	   .collect(Collectors.toList());
//		System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
		// 将字符串换成大写并用逗号链接起来
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
//		String G7Countries = G7.stream()
//				               .map(x -> x.toUpperCase())
//				               .collect(Collectors.joining(", "));
		G7.stream()
		  .map(n->n+"123")
		  .collect(Collectors.toList()).stream().forEach(System.out::println);;
		  
		// 用所有不同的数字创建一个正方形列表
		  List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
//		  List<Integer> distinct = 
//				  numbers.stream()
//				         .map( i -> i*i)
//				         .distinct()
//				         .collect(Collectors.toList());
//		  System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
		  numbers.stream()
		  		 .map(n->n+1)
		  		 .distinct()
		  		 .collect(Collectors.toList()).stream().forEach(System.out::println);;
		  		 
  		//获取数字的个数、最小值、最大值、总和以及平均值
  		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
  		IntSummaryStatistics stats = 
  				primes.stream()
  				      .mapToInt((x) -> x)
  				      .summaryStatistics();
  		System.out.println("Highest prime number in List : " + stats.getMax());
  		System.out.println("Lowest prime number in List : " + stats.getMin());
  		System.out.println("Sum of all prime numbers : " + stats.getSum());
  		System.out.println("Average of all prime numbers : " + stats.getAverage());
  		int max=primes.stream()
  			  .mapToInt((n)->n+1)
  			  .summaryStatistics().getMax();
  		System.out.println("max:"+max);
  		
  		primes.forEach(n->System.out.println(n));
  		
	}
}
		
