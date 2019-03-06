package callBack.test;

public class Main {
	public static void main(String[] args) {
		Student student=new Mike();
		Teacher teacher=new Teacher(student);
		teacher.ask();
	}
}
