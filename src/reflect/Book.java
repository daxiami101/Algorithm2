package reflect;

public class Book {
	private int id;
	private String name;
	private String type;
	public String publicName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("调用了getName");
		return name;
	}
	public void setName(String name) {
		System.out.println("调用了setName");
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPublicName() {
		return publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
	public void test(String first,int a){
		System.out.println("调用了多参数的方法");
		setName(first);
		setId(a);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", type=" + type + ", publicName=" + publicName + "]";
	}
	
	

}
