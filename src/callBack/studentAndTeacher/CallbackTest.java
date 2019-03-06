package callBack.studentAndTeacher;

/**
 * 回调测试，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 */
public class CallbackTest {
 
//    @Test
    public static  void testCallback() {
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);
 
        teacher.askQuestion();
 
    }
    
    public static void main(String[] args) {
    	testCallback();
	}
 
}