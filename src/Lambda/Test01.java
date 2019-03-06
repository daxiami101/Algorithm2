package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
//		List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//		features.forEach(n -> System.out.println(n));
//		// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
//		// 看起来像C++的作用域解析运算符
//		features.forEach(System.out::println);
		
		
		List<Object> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add(5);
		list.forEach(m->System.out.println(m.getClass()));
		
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		    System.out.println("Before Java8, too much code for too little to do");
		    }
		}).start();
		//Java 8方式：
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("hello,test!!");
			}
		}).start();
		new Thread(  ()-> System.out.println("aaaa")).start();
//		FileFilter java = (File f) -> f.getName().endsWith("*.java");

//		String user = doPrivileged(() -> System.getProperty("user.name"));

		new Thread(() -> {
//		  connectToService();
//		  sendNotification();
		}).start();
	}
}
