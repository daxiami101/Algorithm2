package callBack.test;

public class Teacher implements MyCallBack{

	private Student stu;
	public Teacher(Student stu) {
		super();
		this.stu = stu;
	}
	public void ask(){
		stu.solve(this);
	}
	@Override
	public void tellAnswer(int answer) {
		System.out.println(answer);
	}


}
