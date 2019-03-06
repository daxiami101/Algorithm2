package com.daxiami101.frame.inter;

import java.util.ArrayList;
import java.util.List;

public class JpaRepo implements Repo{

	@Override
	public List listAll() {
		System.out.println("执行入库");
		List<String>list=new ArrayList<String>();
		list.add("hello");
		return list;
	}

}
