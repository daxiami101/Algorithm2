package com.daxiami101.excel.recursion;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		System.out.println(result(6));;
		System.out.println(reverse("ABCDEFG"));
	}
	public static int result(int i){
		System.out.println(i);
		if(i==1){
			return i;
		}
		return i*result(i-1);
	}
	
	public static String reverse(String str){
		System.out.println(str);
		if(str.length()==1){
			return str;
		}
		return str.substring(str.length()-1,str.length())+reverse(str.substring(0,str.length()-1));
	}
}
