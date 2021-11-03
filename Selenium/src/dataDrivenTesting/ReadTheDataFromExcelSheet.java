package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataFromExcelSheet {

	public static void main(String[] args) throws Throwable{ 
		String filepath="./resources/excelData.xlsx";
		String sheetName="TC01";
		//create an object for fileinputstream class of java to pass the physical excel file path
		FileInputStream file = new FileInputStream(filepath);
		//create workbook object by calling create method of workbookfactory class of apache poi
		Workbook workBook = WorkbookFactory.create(file);
		//using workbook object reference call sheet, row, and cell methods of apache poi to get the data
		String url = workBook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
		
        double number = workBook.getSheet(sheetName).getRow(1).getCell(3).getNumericCellValue();
        boolean flag = workBook.getSheet(sheetName).getRow(1).getCell(4).getBooleanCellValue();
        
		System.out.println(url);
		System.out.println(number);
		System.out.println(flag);
	}

}
