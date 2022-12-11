package testScript;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	
	@Test()
	public void excel() throws IOException
	{
		
		String path = "C:\\Users\\chinn\\OneDrive\\Documents\\Test1.xlsx";
		XSSFWorkbook book = new XSSFWorkbook(path);
		String sheetName = book.getSheetName(0);
		System.out.println(sheetName);
		XSSFSheet sheet = book.getSheetAt(0);
		
		String check = sheet.getRow(0).getCell(0).getStringCellValue();
		if(check.equalsIgnoreCase("Username"))
		{
			System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		}
	}

}
