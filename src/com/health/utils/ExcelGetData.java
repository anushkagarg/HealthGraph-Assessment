package com.health.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelGetData {

	private static String fromValue;
	 
	public static String getFromValue() throws Exception
   {
       FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\resources\\dataSheet.xlsx");
       XSSFWorkbook wb = new XSSFWorkbook(fi);
       XSSFSheet sh = wb.getSheetAt(0);
   
       fromValue = sh.getRow(0).getCell(0).getStringCellValue();
       System.out.print("excel: "+fromValue);
       return fromValue;
   }
   
}
