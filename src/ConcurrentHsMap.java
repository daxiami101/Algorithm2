
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHsMap {
    public static Map<String, Integer> Eamp = new ConcurrentHashMap<>(30);

    public static void main(String[] args) {
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            int j = (int) (Math.random() * 100);
            num[i] = j;
//            System.out.println(String.valueOf(i));
            Eamp.put(String.valueOf(i),num[i]);
        }
        for(int i = 0; i < num.length; i ++) {
//        	System.out.println("key"+i);
            Eamp.put("key"+i, i);
        }
      for(String str: Eamp.keySet()){
    	  System.out.println(str);
      }
//      Iterator<String> iterator = Eamp.keySet().iterator();
//     while(iterator.hasNext()){
//    	 System.out.println(iterator.next());
//     }

//            for (Map.Entry<String,Integer> entry:Eamp.entrySet()){
//            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
//        }
    }
}