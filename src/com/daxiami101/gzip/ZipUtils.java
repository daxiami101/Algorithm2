package com.daxiami101.gzip;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * @description ZIP格式压缩文件
 * @author guo
 *
 */
public class ZipUtils {
    
    public static void main(String[] args) {
        try {
            zipFile("D:\\4.json", "D:\\test\\4zip.zip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * ZIP方式 对文件进行压缩
     * 
     * @param source 源文件
     * @param target 目标文件
     * @throws IOException
     */
    public static void zipFile(String source, String target)
            throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fin = null;
        FileOutputStream fout = null;
        fin = new FileInputStream(source);
        fout = new FileOutputStream(target);
        ZipOutputStream zipOut = new ZipOutputStream(fout);
        zipOut.setLevel(9);
        ZipEntry entry = new ZipEntry("11111");
        zipOut.putNextEntry(entry);
        byte[] buf = new byte[1024];
        try {
            int num;
            while ((num = fin.read(buf)) != -1) {
                zipOut.write(buf, 0, num);
            }
        } finally {
            if (zipOut != null)
                zipOut.close();
            if (fout != null)
                fout.close();
            if (fin != null)
                fin.close();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}