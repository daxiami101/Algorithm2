package method;
import java.io.File;

public class CallbackDigestUserInterface { 
    /** 
     * 接收摘要码，输出到控制台 
     * 
     * @param digest        摘要码 
     * @param inputFileName 输入的文件名 
     */ 
    public static void receiveDigest(byte[] digest, String inputFileName) { 
        StringBuffer result = new StringBuffer(inputFileName); 
        result.append(": "); 
        for (int j = 0; j < digest.length; j++) { 
            result.append(digest[j] + " "); 
        } 
        System.out.println(result); 
    } 

    public static void main(String[] args) { 
        String arr[] = {"C:\\xcopy.txt", "C:\\x.txt", "C:\\xb.txt", "C:\\bf2.txt"}; 
        args = arr; 
        for (int i = 0; i < args.length; i++) { 
            File f = new File(args[i]); 
            CallbackDigest cb = new CallbackDigest(f); 
            Thread t = new Thread(cb); 
            t.start(); 
        } 
    } 
}