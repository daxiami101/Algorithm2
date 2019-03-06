package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class ads {
	public static void main(String[] args) {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"};  
			List<String> players =  Arrays.asList(atp);  
			  
			// 使用 lambda 表达式以及函数操作(functional operation)  
			players.forEach((player) -> System.out.print(player + "; "));  
			   
			// 在 Java 8 中使用双冒号操作符(double colon operator)  
			players.forEach(System.out::println);
			
			players.forEach(n->System.out.println(n));
			
			new Thread(
//					()->System.out.println("12345")
//					(int even, int odd) -> {even + odd};
//					n->helloCallable(n)
					).start();
			String []datas = new String[] {"peng","zhao","li"};
		    Arrays.sort(datas,(v1 , v2) -> Integer.compare(v1.length(), v2.length()));
		    Stream.of(datas).forEach(param -> System.out.println(param));
		    
		    List<Integer> nums = Arrays.asList(1,null,3,4,null,6);
		    nums.stream().filter(num -> num != null).count();
	}
	 Callable<String> helloCallable(String name) {
		  String hello = "Hello";
		  return () -> (hello + ", " + name);
		}
}

