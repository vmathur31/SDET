package FirstTestNG;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EnterDataExcel {

public static void main(String[] args) {
		

	    try {
	              // Specify the path of file
	              File src=new File("./Resources/Read_Write.xlsx");
	             
	               // load file
	               FileInputStream fis=new FileInputStream(src);
	             
	               // Load workbook
	               XSSFWorkbook wb=new XSSFWorkbook(fis);
	               
	               // Load sheet- Here we are loading first sheetonly
	               XSSFSheet sh1= wb.getSheetAt(0);
	                  XSSFCell cell = null;
	             
	              // getRow() specify which row we want to read.
	             
	              // and getCell() specify which column to read.
	              // getStringCellValue() specify that we are reading String data.
	                  
	                cell = sh1.getRow(1).getCell(1);
	          		cell.setCellValue("test123456");
	             
	             
			/*
			 * System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 * 
			 * System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 * 
			 * System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 * 
			 * System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 * 
			 * System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			 * 
			 * System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			 */
	             
	              } catch (Exception e) {
	             
	               System.out.println(e.getMessage());
	             
	              }

	}

}
