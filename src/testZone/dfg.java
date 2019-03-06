package testZone;

public class dfg {
	public static void main(String[] args) {
		StringBuffer updateResult=new StringBuffer();
		String currentStatus="A9B8C4DCE7F7";
		char code='A';
		int specialValue=4;
//		int index=currentStatus.indexOf(code)+1;
//		int hexNum=Integer.valueOf(currentStatus.charAt(index)+"", 16);//十六进制数字，code后的value值，标识当前的通过状态
//		int result=hexNum|specialValue;//计算后的特征值
//		System.out.println("hexNum:"+hexNum);
//		System.out.println("result:"+result);
		System.out.println("currentStatus:"+currentStatus);
		String[] strArr=new String[currentStatus.toCharArray().length];
		for(int i=0;i<currentStatus.toCharArray().length;i++){
			strArr[i]=currentStatus.toCharArray()[i]+"";
			System.out.println("strArr[i]:"+strArr[i]);
		}
		//从当前的状态值中，按照code找到当前的value,和通过特征值求或运算
		int index=currentStatus.indexOf(code)+1;
		int hexNum=Integer.valueOf(currentStatus.charAt(index)+"", 16);//十六进制数字--对应的十进制数字，code后的value值，标识当前的通过状态
		int result=hexNum|specialValue;//计算后的特征值
		
		//result转换为16进制数字
		String resultStr=Integer.toHexString(result);
		//将index处的状态值，置换为resultStr
		strArr[index]=resultStr.toUpperCase();
		for(String str:strArr){
			System.out.println("str:"+str);
			updateResult.append(str);
		}
		System.out.println("updateResult:"+updateResult);
	}
}
