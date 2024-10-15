package ddt_Cross_Browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel_ShortCut {
		@Test 
		public void readExcel() throws FileNotFoundException, IOException
		{
			XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream(new File ("./testdata/TestData.xlsx")));
			System.out.println(wb.getSheet("Login").getRow(0).getCell(0).getStringCellValue());
			System.out.println(wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue());
			System.out.println(wb.getSheet("Users").getRow(2).getCell(0).getStringCellValue());
			System.out.println(wb.getSheet("Users").getRow(1).getCell(1).getNumericCellValue());
	}

}
