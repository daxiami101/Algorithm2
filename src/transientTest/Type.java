package transientTest;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class Type {
	private String name;
	private String age;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public <E>void identify(List<E> list){
		
	}

}
