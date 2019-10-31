//package test.java.ftp;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.SocketException;
//
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPReply;
//
//import net.coobird.thumbnailator.Thumbnails;  
//	  
//	/** 
//	 * FTP宸ュ叿绫� 
//	 * @author 绻佸崕 
//	 */  
//	public class FTPUtils {  
//	    private static FTPUtils instance = null;  
//	    private static FTPClient ftpClient = null;  
//	    private String cache_dir = "e:/cache/";//鐢ㄤ簬鍘嬬缉鍥剧墖  
//	    private String server = "192.168.1.13";  
//	    private int port = 21;  
//	    private String userName = "ZW-13";  
//	    private String userPassword = "123";  
//	  
//	    public static FTPUtils getInstance(){  
//	       if(instance == null){  
//	           instance = new FTPUtils();  
//	       }  
//	         
//	       ftpClient = new FTPClient();  
//	       return instance;  
//	    }  
//	     
//	   /** 
//	    * 杩炴帴FTP鏈嶅姟鍣� 
//	    * @return 
//	    */  
//	   private boolean connect(){  
//	        boolean stat = false;  
//	        try {  
//	            if(ftpClient.isConnected())  
//	                return true;  
//	            ftpClient.connect(server, port);  
//	            stat = true;  
//	        } catch (SocketException e) {  
//	            stat = false;  
//	            e.printStackTrace();  
//	        } catch (IOException e) {  
//	            stat = false;  
//	            e.printStackTrace();  
//	        }  
//	        return stat;  
//	   }  
//	     
//	   /** 
//	    * 鎵撳紑FTP鏈嶅姟鍣� 
//	    * @return 
//	    */  
//	   public boolean open(){  
//	       if(!connect()){  
//	           return false;  
//	       }  
//	         
//	       boolean stat = false;  
//	       try {  
//	           stat = ftpClient.login(userName, userPassword);  
//	           // 妫�娴嬭繛鎺ユ槸鍚︽垚鍔�  
//	           int reply = ftpClient.getReplyCode();  
//	           if (!FTPReply.isPositiveCompletion(reply)) {  
//	               close();  
//	               stat = false;  
//	           }  
//	       } catch (IOException e) {  
//	           stat = false;  
//	       }  
//	       return stat;  
//	   }  
//	     
//	     
//	   /** 
//	    * 鍏抽棴FTP鏈嶅姟鍣� 
//	    */  
//	   public void close(){  
//	       try {  
//	           if(ftpClient != null){  
//	               if(ftpClient.isConnected()){    
//	                   ftpClient.logout();  
//	                   ftpClient.disconnect();  
//	               }  
//	                 
//	               ftpClient = null;  
//	           }  
//	       } catch (IOException e) {  
//	       }  
//	   }  
//	     
//	     
//	   /** 
//	    * 涓婁紶鏂囦欢鍒癋TP鏈嶅姟鍣� 
//	    * @param filename 
//	    * @param path 
//	    * @param input 
//	    * @return 
//	    */  
//	   public boolean upload(String filename,String path,InputStream input){  
//	       boolean stat = false;  
//	       try {  
//	           cd(path);  
//	           ftpClient.setBufferSize(1024);     
//	           ftpClient.setControlEncoding("GBK");     
//	           ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);  
//	           stat = ftpClient.storeFile(filename, input);             
//	           input.close();  //鍏抽棴杈撳叆娴�  
//	       } catch (IOException e) {    
//	             
//	       }  
//	       return stat;  
//	   }  
//	     
//	   /** 
//	    * 涓婁紶鏂囦欢鍒癋TP鏈嶅姟鍣� 
//	    * @param filename 
//	    * @param path 
//	    * @param input 
//	    * @return 
//	    */  
//	   public boolean upload(String filename,String path,String filepath){  
//	       boolean stat = false;  
//	       try {  
//	           cd(path);  
//	           ftpClient.setBufferSize(1024);     
//	           ftpClient.setControlEncoding("GBK");     
//	           ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);  
//	           FileInputStream input = new FileInputStream(new File(filepath));  
//	           stat = ftpClient.storeFile(filename, input);             
//	           input.close();  //鍏抽棴杈撳叆娴�  
//	       } catch (IOException e) {    
//	             
//	       }  
//	       return stat;  
//	   }  
//	     
//	   /** 
//	    * 涓婁紶鏂囦欢 
//	    * @param filename 
//	    * @param path 
//	    * @param file 
//	    * @return 
//	    */  
//	   public boolean upload(String filename,String path,File file){  
//	       boolean stat = false;  
//	       try {  
//	           cd(path);  
//	           ftpClient.setBufferSize(1024);     
//	           ftpClient.setControlEncoding("GBK");     
//	           ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);  
//	           FileInputStream input = new FileInputStream(file);  
//	           stat = ftpClient.storeFile(filename,input);             
//	           input.close();  //鍏抽棴杈撳叆娴�  
//	       } catch (IOException e) {    
//	             
//	       }  
//	       return stat;  
//	   }  
//	     
//	   /** 
//	    * 涓婁紶鍥剧墖鑷姩鍘嬬缉澶勭悊 
//	    * @param path 
//	    * @param filename 
//	    * @param input 
//	    * @param quality 
//	    * @param maxWidth 
//	    * @param maxHeight 
//	    * @return 
//	    */  
//	   public boolean uploadImage(String path,String filename,InputStream input,float quality,int maxWidth,int maxHeight){  
//	       boolean stat = false;  
//	       try {  
//	           String suffex = filename.substring(filename.lastIndexOf(".")+1, filename.length());  
//	           System.out.println(suffex);  
//	           File imagePath = new File(cache_dir + filename);  
//	           Thumbnails.of(input).outputQuality(quality).size(maxWidth,maxHeight).toFile(imagePath);  
//	           input.close();  
//	             
//	           if(!imagePath.exists()){  
//	               return false;  
//	           }  
//	             
//	           cd(path);    
//	           ftpClient.setBufferSize(1024);     
//	           ftpClient.setControlEncoding("GBK");     
//	           ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);  
//	           FileInputStream input2 = new FileInputStream(imagePath);  
//	           stat = ftpClient.storeFile(filename,input2);             
//	           input2.close();//鍏抽棴杈撳叆娴�  
//	           imagePath.delete();  
//	           stat = true;  
//	       } catch (IOException e) {    
//	           e.printStackTrace();  
//	           stat = false;  
//	       }  
//	       return stat;  
//	   }  
//	     
//	     
//	   /** 
//	    * 寰幆鍒囨崲鐩綍 
//	    * @param dir 
//	    * @return 
//	    */  
//	   public boolean cd(String dir){  
//	       boolean stat = true;  
//	    try {  
//	           String[] dirs = dir.split("/");  
//	           if(dirs.length == 0){  
//	               return ftpClient.changeWorkingDirectory(dir);  
//	           }  
//	             
//	           stat = ftpClient.changeToParentDirectory();  
//	            for(String dirss : dirs){  
//	                stat = stat && ftpClient.changeWorkingDirectory(dirss);  
//	            }  
//	              
//	            stat = true;  
//	       } catch (IOException e) {  
//	            stat = false;  
//	       }  
//	       return stat;  
//	   }  
//	     
//	   /*** 
//	    * 鍒涘缓鐩綍 
//	    * @param dir 
//	    * @return 
//	    */  
//	   public boolean mkdir(String dir){  
//	       boolean stat = false;  
//	       try {  
//	           ftpClient.changeToParentDirectory();  
//	           ftpClient.makeDirectory(dir);  
//	           stat = true;  
//	       } catch (IOException e) {  
//	            stat = false;  
//	       }  
//	       return stat;  
//	   }  
//	     
//	   /*** 
//	    * 鍒涘缓澶氫釜灞傜骇鐩綍 
//	    * @param dir dong/zzz/ddd/ewv 
//	    * @return 
//	    */  
//	   public boolean mkdirs(String dir){  
//	       String[] dirs = dir.split("/");  
//	       if(dirs.length == 0){  
//	           return false;  
//	       }  
//	       boolean stat = false;  
//	       try {  
//	           ftpClient.changeToParentDirectory();  
//	            for(String dirss : dirs){  
//	                ftpClient.makeDirectory(dirss);  
//	                ftpClient.changeWorkingDirectory(dirss);  
//	            }  
//	              
//	            ftpClient.changeToParentDirectory();  
//	            stat = true;  
//	       } catch (IOException e) {  
//	            stat = false;  
//	       }  
//	       return stat;  
//	   }  
//	     
//	   /** 
//	    * 鍒犻櫎鏂囦欢澶� 
//	    * @param pathname 
//	    * @return 
//	    */  
//	   public boolean rmdir(String pathname){  
//	       try{  
//	           return ftpClient.removeDirectory(pathname);  
//	       }catch(Exception e){  
//	           return false;  
//	       }  
//	   }  
//	     
//	   /** 
//	    * 鍒犻櫎鏂囦欢 
//	    * @param pathname 
//	    * @return 
//	    */  
//	   public boolean remove(String pathname){  
//	       boolean stat = false;  
//	       try{  
//	           stat = ftpClient.deleteFile(pathname);   
//	       }catch(Exception e){  
//	           stat = false;  
//	       }  
//	       return stat;  
//	   }  
//	     
//	   /** 
//	    * 绉诲姩鏂囦欢鎴栨枃浠跺す 
//	    * @param pathname1 
//	    * @param pathname2 
//	    * @return 
//	    */  
//	   public boolean rename(String pathname1,String pathname2){  
//	        try {  
//	            return ftpClient.rename(pathname1, pathname2);  
//	        } catch (IOException e) {  
//	            e.printStackTrace();  
//	            return false;  
//	        }  
//	   }  
//	     
//	}  
