package September;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {

	public static void main(String[] args) throws IOException {
		String Str = "./TestData/testdata.xlsx";
		FileInputStream fis = new FileInputStream(Str);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String CellValue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(CellValue);
		workbook.close();
	}

}
