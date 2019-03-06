package com.daxiami101.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CsvParse {
	public static void main(String[] args) throws Exception {
		String path="C://Users//admin02//Desktop//5，6月订单信息//upload";
		File files=new File(path);
		for(File file:files.listFiles()){
			if(file.getName().contains("单次运营")){
				//1.获取文件IO流
				InputStream fis=new FileInputStream(file);
				//2.读取文件内容
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(fis));
				String str = null;
				while (true) {
					str = reader.readLine();
					if(str!=null)
						System.out.println(str.split(",")[0]);
					else
						break;
				}
			    fis.close();
				//3.解析文件内容
//			    System.out.println("orderNo:"+sb.toString().split(",")[0]);
			}
			
		}
	}

}
