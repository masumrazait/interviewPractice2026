package TCS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputReader {
	public static void main(String[] args) throws IOException {
		String str = "./TestData/testdata.xlsx";
		FileInputStream fil = new FileInputStream(str);
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cellValue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		workbook.close();
	}
}
