package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDifferentDataFromExcel {

	public static void main(String[] args) throws Throwable, Throwable {
		String filepath="./resources/excelData.xlsx";
		String sheetName="TC02";
		
		FileInputStream file = new FileInputStream(filepath);
		Workbook workBook = WorkbookFactory.create(file);
		String url = workBook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
        double number = workBook.getSheet(sheetName).getRow(1).getCell(3).getNumericCellValue();
        boolean flag = workBook.getSheet(sheetName).getRow(1).getCell(4).getBooleanCellValue();
        
		System.out.println(url);
		System.out.println(number);
		System.out.println(flag);
	}

}
