package com.daxiami101.apache.common.io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class DemoApacheCommonIo2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		String word="ambiguous";
//	    解析url地址
	    Document document = 
	    		Jsoup.parse(new URL("https://www.vocabulary.com/dictionary/"+word), 5000);
	    //获取title的内容
	    Element title = document.getElementsByTag("title").first();
	    Elements contentShort = document.getElementsByClass("short");
	    Elements contentLong = document.getElementsByClass("long");
	    System.out.println(contentShort.text());
	    System.out.println(contentLong.text());
	    System.out.println("=================================");
	    
	    
	    
	}
	public void getInfo(){
		
	}
	
}
