package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileIOMain {
	public static void main(String[] args) throws Exception{
		String dirname = "D:/03lab/12hadoop/DDJS";//D:\03lab\12hadoop\DDJS
	    File f1 = new File(dirname);
	    if (f1.isDirectory()) {
	      System.out.println( "目录 " + dirname);
	      String s[] = f1.list();
	      for (int i=0; i < s.length; i++) {
	        File f = new File(dirname + "/" + s[i]);
	        if (f.isDirectory()) {
	          System.out.println(s[i] + " 是一个目录");
	          File[] listFiles = f.listFiles();
	          for(File file:listFiles){
	        	  System.out.println("name:"+file.getName());
	        	  FileInputStream fip = new FileInputStream(file);
	        	    // 构建FileInputStream对象
	        	  InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
	        	    // 构建InputStreamReader对象,编码与写入相同
	              StringBuffer sb = new StringBuffer();
	        	  while (reader.ready()) {
	        	      sb.append((char) reader.read());
	        	      // 转成char加到StringBuffer对象中
	        	    }
	        	    System.out.println(sb.toString());
	        	    
	        	    reader.close();
	        	    // 关闭读取流
	        	    fip.close();
	          }
	          
	        } else {
	          System.out.println(s[i] + " 是一个文件");
	        }
	      }
	    } else {
	      System.out.println(dirname + " 不是一个目录");
	    }
	}
}
