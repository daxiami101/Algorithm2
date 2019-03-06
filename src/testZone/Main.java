package testZone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int index=0;
		int sum=0;
		int min=0;
		//注意!"0".equals(str)，避免00...00，即最后一位是0，将会出现所有字符串被截掉,成为空字符传""的情况
		while(str.charAt(index)=='0' && !"0".equals(str) ){
			str=str.substring(index+1);//截取字符串，将当前第一位为0的截掉
			System.out.println("当前str1："+str);
		}
		min=Integer.parseInt(str);//初始化min,将录入的第一个有效数字，作为min的初值
		while(str!=null){
			//注意!"0".equals(str)，避免00...00，即最后一位是0，将会出现所有字符串被截掉,成为空字符传""的情况
			while(str.charAt(index)=='0' && !"0".equals(str) ){
				str=str.substring(index+1);//截取字符串，将当前第一位为0的截掉
				System.out.println("当前str："+str);
			}
			if(min>Integer.parseInt(str)){//与初始化的min作比较，得到当前的min
				min=Integer.parseInt(str);
			}
			System.out.println("有效str:"+str);
			sum+=Integer.parseInt(str);
			index=0;//一轮处理结束后，将字符串的index重置为0，以便下次循环使用
			System.out.println("当前sum:"+sum);
			System.out.println("当前min:"+min);
			str=sc.nextLine();
			
		}
		sc.close();
	}

}
