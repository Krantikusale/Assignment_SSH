package ddt_Cross_Browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
	
File src= new File("./testdata/TestData.xlsx");
FileInputStream fis=new FileInputStream(src);

XSSFWorkbook wb=new XSSFWorkbook(fis);
int sheetCount=wb.getNumberOfSheets();
System.out.println("sheetCount is "+sheetCount);

XSSFSheet sh1=wb.getSheet("Login");
int row=sh1.getPhysicalNumberOfRows();
System.out.println("Total rows are "+row);

int newRowCount=sh1.getLastRowNum();
System.out.println("Total rows new count is "+newRowCount);

XSSFRow r1=sh1.getRow(0);

XSSFCell c1=r1.getCell(0);

System.out.println(c1.getStringCellValue());

}

}
 