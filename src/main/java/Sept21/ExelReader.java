package Sept21;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelReader {

	public static void main(String[] args) throws IOException {
		String str = "./TestData/testdata.xlsx";
		FileInputStream fis = new FileInputStream(str);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cellvalue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellvalue);
		workbook.close();
	}

}
