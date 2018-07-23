package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class TestCaseInfoExcelReader {




	@Test
	public static void SelectRowAndCells(int row, int cell) throws Exception {


		File src = new File ("C:\\Users\\krkl\\Desktop\\Kristofer test.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		String RowAndCell = sheet1.getRow(row).getCell(cell).getStringCellValue();
		
		System.out.println(RowAndCell);

	











	}
}

