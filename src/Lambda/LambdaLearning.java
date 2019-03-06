package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLearning {
	public static void main(String[] args) {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"};  
			List<String> list =  Arrays.asList(atp);
			int total=list.stream().map(n->n.length()).reduce((sum,n)->n+sum).get();
			list.stream().filter(n->n.length()>10).collect(Collectors.toList()).forEach(System.out::println);;
			list.stream().map(n->n.length()).distinct().collect(Collectors.toList()).forEach(System.out::println);
			long num=list.stream().map(n->n.length()).mapToInt(n->n).summaryStatistics().getCount();
			System.out.println(num+" "+total);
	}
}
