package dataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

public class ReadMultipleDataFromCSVFile {

	public static void main(String[] args) throws Throwable {
		String filePath="./resources/cvsData.csv";
		FileReader fileReader = new FileReader(filePath);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] arr = csvReader.readNext();
		while(arr!=null) {
		for(String data:arr) {
			System.out.println(data);
		}
		arr=csvReader.readNext();
		}
		csvReader.close();
	}
}
