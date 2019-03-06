package method02;

import java.io.File;

public class ListCallbackDigestUser implements DigestListener{ 
    private File inputFile;     //回调与每个文件绑定 
    private byte digest[];      //文件的消息摘要码 

    public ListCallbackDigestUser(File inputFile) { 
        this.inputFile = inputFile; 
    } 

    /** 
     * 计算某个文件的消息摘要码 
     */ 
    public void calculateDigest() { 
        ListCallbackDigest callback = new ListCallbackDigest(inputFile); 
        Thread t = new Thread(callback); 
        t.start(); 
    } 

    public void digestCalculated(byte digest[]) { 
        this.digest = digest; 
        //将消息摘要码输出到控制台实际上执行的是this.toString()方法 
        System.out.println(this); 
    } 

    /** 
     * 显示结果 
     * 
     * @return 结果 
     */ 
    public String toString() { 
        String result = inputFile.getName() + ": "; 
        if (digest != null) { 
            for (byte b : digest) { 
                result += b + " "; 
            } 
        } else { 
            result += "digest 不可用！"; 
        } 
        return result; 
    } 

    public static void main(String[] args) { 
        String arr[] = {"C:\\xcopy.txt", "C:\\x.txt", "C:\\xb.txt", "C:\\bf2.txt"}; 
        args = arr; 
        for (int i = 0; i < args.length; i++) { 
            File f = new File(args[i]); 
            ListCallbackDigestUser cb = new ListCallbackDigestUser(f); 
            cb.calculateDigest(); 
        } 
    } 
}