package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromSheet {

	public static void main(String[] args) throws Throwable, Throwable {
		String filepath="./resources/excelData.xlsx";
		String sheetName="TC03";
		
		FileInputStream file = new FileInputStream(filepath);
		Workbook workBook = WorkbookFactory.create(file);
		Sheet sheet = workBook.getSheet(sheetName);
		int rowNo = sheet.getPhysicalNumberOfRows();
		int cellNo = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowNo;i++) {
			for(int j=0;j<cellNo;j++) {
				System.out.println( sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}

	}

}
