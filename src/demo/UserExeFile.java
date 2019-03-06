package demo;

import java.io.File;
 
 public class UserExeFile
 {
     public static void main(String args [])
     {
         try{
             Runtime mt =Runtime.getRuntime();
              //找到相对应的绝对路径。启动记事本文件
             File  myfile =new File("c:\\Windows","Notepad.exe");
             mt.exec(myfile.getAbsolutePath());
              //创建新的文件路径,启动ie浏览器
//             myfile = new File("c:\\ProgramFiles\\Internet Explorer","IEXPLORE.www.sohu.com");
//             mt.exec(myfile.getAbsolutePath());   
           }
         catch(Exception e)
         {
           System.out.println(e);            
         }
     }
 }