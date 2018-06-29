package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib extends BaseTest{
	public static Workbook wb;
	

	public static String getPropertyValue(String propertyname) {
		String propertyvalue = "";
		Properties prop= new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			propertyvalue=prop.getProperty(propertyname);
		} catch (Exception e) {
			
		} 
		
		return propertyvalue;
	}
	public static String getCellValue(String sheetName, int rowNum, int columnNum) {
		String cellValue = "";
		try {
			wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			cellValue = wb.getSheet(sheetName).getRow(rowNum).getCell(columnNum).toString();
		} catch (Exception e) {
			
		} 
		return cellValue;
	}
	public static int getRowCount(String sheetName) {
		int lastRowNum=0;
		try {
			wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		 lastRowNum = wb.getSheet(sheetName).getLastRowNum();
		} catch (Exception e) {
			
		} 
		return lastRowNum;
		
	}

}
