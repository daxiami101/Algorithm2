package Timer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class asdf {
	public static void main(String[] args) {
		//数据要求：从数据库中查出的数据，必须是唯一的，前加distinct
		int minReal=2;//当前最大车次数,最后一个数据可能为传过来
		int min=0;
		List<Integer>list=new ArrayList<>();
		List<Integer>listMatch=new ArrayList<>();
		//模拟数据源
		for (int i = 10; i <=20; i++) {
			list.add(i);
			listMatch.add(i);
		}
		System.out.println("listMatch:"+listMatch);
		
		list.remove((Object)15);//Object
		list.remove((Object)13);//Object
		
		Collections.sort(list);//list变为有序
		System.out.println("list:"+list);
		
		//数据核查
		int max=list.get(list.size()-1);//获取最大值(可以用排序)
		min=list.get(0);//获取最小值
		
		if(!list.get(0).equals(minReal)){
			System.out.println("hello");
			for (int i = 1; i <=list.get(0)-minReal; i++) {
				listMatch.add(minReal+i);
			}
			Collections.sort(list);//list变为有序
		}
		
		int counter=list.size();//实际接收个数
		System.out.println("max:"+max+" min:"+min+" 应该接收数据个数:"+(max-min+1)+"个");
		System.out.println("实际接收个数:"+counter+"个");
		for (Integer e:list) {
			listMatch.remove(e);
		}
		Collections.sort(listMatch);
		System.out.println("缺失的数据为:"+listMatch);
		
		Calendar startTime = new GregorianCalendar(2016, 8, 9,0,0,0); 
		 Date date = startTime.getTime();
		 Calendar endTime =new GregorianCalendar(2016,8,9,23,55,55);
		 Date date2=endTime.getTime();
		 System.out.println("Date is:"+date); //java月份是从0- 11,月份设置时要减1
		 System.out.println("Date2 is:"+date2);
		 
		
	}
}
