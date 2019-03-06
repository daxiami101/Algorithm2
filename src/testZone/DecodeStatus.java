package testZone;

import java.util.ArrayList;
import java.util.List;

public class DecodeStatus {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StringBuffer updateResult=new StringBuffer();
		String currentStatus="GBHCI4JCKFL7";
		char code='J';
		int specialValue=4;
		List<String>list=new ArrayList<>();
		
		int index=currentStatus.indexOf(code)+1;
		System.out.println("index:"+index);
		int hexNum=Integer.valueOf(currentStatus.charAt(index)+"", 16);//十六进制数字，code后的value值，标识当前的通过状态
		String hexNumReverse=new StringBuffer(Integer.toBinaryString(hexNum)+"").reverse().toString();
		
		for(int i=0;i<hexNumReverse.toCharArray().length;i++){
//			list.add(e)
			if(hexNumReverse.toCharArray()[i]!='0'){
				 list.add(""+code+(int)(((int)(hexNumReverse.toCharArray()[i])-48)*Math.pow(2, i)));
//				System.out.println("通过的接口为："+code+(int)(((int)(hexNumReverse.toCharArray()[i])-48)*Math.pow(2, i)));;//*Math.pow(2, i);
			}
			
		}
		System.out.println("list:"+list);
	}
}
