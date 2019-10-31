//package com.daxiami101.gzip;
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.Enumeration;
//import org.apache.tools.zip.ZipEntry;  
//import org.apache.tools.zip.ZipFile;  
//import org.apache.tools.zip.ZipOutputStream;  
///**
// *  
// * @author admin02
// * 2018骞�8鏈�3鏃� 涓嬪崍1:42:43
// *   ZIP宸ュ叿鍖�(鏀寔涓枃) 
// * 渚濊禆锛歛nt-1.9.6.jar 
// */
//public class CHZipUtils {  
//  
//    /**浣跨敤GBK缂栫爜鍙互閬垮厤鍘嬬缉涓枃鏂囦欢鍚嶄贡鐮�*/  
//    private static final String CHINESE_CHARSET = "GBK";  
//    /**鏂囦欢璇诲彇缂撳啿鍖哄ぇ灏�*/  
//    private static final int CACHE_SIZE = 1024;  
//  
//    /** 
//     * 鍘嬬缉鏂囦欢 
//     * @param sourceFolder 鍘嬬缉鏂囦欢澶� 
//     * @param zipFilePath 鍘嬬缉鏂囦欢杈撳嚭璺緞 
//     */  
//    public static void zip(String sourceFolder, String zipFilePath) {  
//        OutputStream os = null;  
//        BufferedOutputStream bos = null;  
//        ZipOutputStream zos = null;  
//        try {  
//            os = new FileOutputStream(zipFilePath);  
//            bos = new BufferedOutputStream(os);  
//            zos = new ZipOutputStream(bos);  
//            // 瑙ｅ喅涓枃鏂囦欢鍚嶄贡鐮�  
//            zos.setEncoding(CHINESE_CHARSET);  
//            File file = new File(sourceFolder);  
//            String basePath = null;  
//            if (file.isDirectory()) {//鍘嬬缉鏂囦欢澶�  
//                basePath = file.getPath();  
//            } else {  
//                basePath = file.getParent();  
//            }  
//            zipFile(file, basePath, zos);  
//              
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        } finally{  
//            try {  
//                if (zos != null) {  
//                    zos.closeEntry();  
//                    zos.close();  
//                }  
//                if (bos != null) {  
//                    bos.close();  
//                }  
//                if (os != null) {  
//                    os.close();  
//                }  
//            } catch (IOException e) {  
//                e.printStackTrace();  
//            }  
//        }  
//    }  
//  
//    /** 
//     * 閫掑綊鍘嬬缉鏂囦欢 
//     * @param parentFile 
//     * @param basePath 
//     * @param zos 
//     * @throws Exception 
//     */  
//    private static void zipFile(File parentFile, String basePath, ZipOutputStream zos) throws Exception {  
//        File[] files = new File[0];  
//        if (parentFile.isDirectory()) {  
//            files = parentFile.listFiles();  
//        } else {  
//            files = new File[1];  
//            files[0] = parentFile;  
//        }  
//        String pathName;  
//        InputStream is;  
//        BufferedInputStream bis;  
//        byte[] cache = new byte[CACHE_SIZE];  
//        for (File file : files) {  
//            if (file.isDirectory()) {  
//                pathName = file.getPath().substring(basePath.length() + 1) + File.separator;  
//                zos.putNextEntry(new ZipEntry(pathName));  
//                zipFile(file, basePath, zos);  
//            } else {  
//                pathName = file.getPath().substring(basePath.length() + 1);  
//                is = new FileInputStream(file);  
//                bis = new BufferedInputStream(is);  
//                zos.putNextEntry(new ZipEntry(pathName));  
//                int nRead = 0;  
//                while ((nRead = bis.read(cache, 0, CACHE_SIZE)) != -1) {  
//                    zos.write(cache, 0, nRead);  
//                }  
//                bis.close();  
//                is.close();  
//            }  
//        }  
//    }  
//  
//    /** 
//     * 瑙ｅ帇鍘嬬缉鍖� 
//     * @param zipFilePath 鍘嬬缉鏂囦欢璺緞 
//     * @param destDir 瑙ｅ帇鐩綍 
//     */  
//    public static void unZip(String zipFilePath, String destDir) {  
//        ZipFile zipFile = null;  
//        try {  
//            BufferedInputStream bis = null;  
//            FileOutputStream fos = null;  
//            BufferedOutputStream bos = null;  
//            zipFile = new ZipFile(zipFilePath, CHINESE_CHARSET);  
//            Enumeration<ZipEntry> zipEntries = zipFile.getEntries();  
//            File file, parentFile;  
//            ZipEntry entry;  
//            byte[] cache = new byte[CACHE_SIZE];  
//            while (zipEntries.hasMoreElements()) {  
//                entry = (ZipEntry) zipEntries.nextElement();  
//                if (entry.isDirectory()) {  
//                    new File(destDir + entry.getName()).mkdirs();  
//                    continue;  
//                }  
//                bis = new BufferedInputStream(zipFile.getInputStream(entry));  
//                file = new File(destDir + entry.getName());  
//                parentFile = file.getParentFile();  
//                if (parentFile != null && (!parentFile.exists())) {  
//                    parentFile.mkdirs();  
//                }  
//                fos = new FileOutputStream(file);  
//                bos = new BufferedOutputStream(fos, CACHE_SIZE);  
//                int readIndex = 0;  
//                while ((readIndex = bis.read(cache, 0, CACHE_SIZE)) != -1) {  
//                    fos.write(cache, 0, readIndex);  
//                }  
//                bos.flush();  
//                bos.close();  
//                fos.close();  
//                bis.close();  
//            }  
//        } catch (IOException e) {  
//            e.printStackTrace();  
//        }finally{  
//            try {  
//                zipFile.close();  
//            } catch (IOException e) {  
//                e.printStackTrace();  
//            }  
//        }  
//    }  
//  
//    public static void main(String[] args) throws Exception {  
////      String sourceFolder = "D:/test/1.txt";  
////      String sourceFolder = "D:/test/涓枃鍚�.txt";  
//        String sourceFolder = "D:/test/cms";  
//        String zipFilePath = "D:\\11taiji\\25ETC\\01ETC\\鏂板缓鏂囦欢澶筡\鏂板缓鏂囦欢澶筡\Transaction\\9999999911020001_9999999901020001_46794825.zip";  
//        String destDir = "D:/test/zip/";  
////        CHZipUtils.zip(sourceFolder, zipFilePath);  
//      CHZipUtils.unZip(zipFilePath, destDir);  
//      
//      //璇诲彇鏂囦欢澶�
//      //鍒ゆ柇鍚庣紑鍚嶄负.xml鐨勬枃浠讹紝瑙ｆ瀽json
//      //json钀藉湴
//        OutputStream os = new FileOutputStream("D:\\a.txt");
////        os.write(json.toJSONString().getBytes());
//     	os.close();
//
//        System.out.println("********鎵ц鎴愬姛**********");  
//    }  
//  
//}  
