package JTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exxcel {
	
	public int count () throws IOException {
	File f = new File ("E:\\SSD\\Book2.xlsx");
	FileInputStream fis =new FileInputStream(f);
	XSSFWorkbook wb =new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet("Sheet1");
	
	 int count = sh.getPhysicalNumberOfRows();
	 return count;
	}
	
	public String getdata(int x ,int y) throws IOException {
		File f = new File ("E:\\SSD\\Book2.xlsx");
		FileInputStream fis =new FileInputStream(f);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		String getdata=sh.getRow(x).getCell(y).getStringCellValue();
		
		return null;
		

}
}