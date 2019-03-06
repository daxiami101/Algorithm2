package com.daxiami101.excel;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet1 = wb.createSheet();
		HSSFSheet sheet2 = wb.createSheet();
		HSSFSheet sheet3 = wb.createSheet("数据统计");
		HSSFSheet sheet4 = wb.createSheet("数据统计");
		FileOutputStream fileOutputStream = new FileOutputStream("c:\\hello.xls");
		wb.write(fileOutputStream);
		fileOutputStream.close();
		wb.close();
		
	}
}
