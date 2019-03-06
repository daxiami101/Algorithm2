package callBack.test;

public class Mike implements Student{

	@Override
	public void solve(MyCallBack callBack) {
		callBack.tellAnswer(2);
	}

}
