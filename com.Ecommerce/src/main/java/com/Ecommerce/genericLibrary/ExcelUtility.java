package com.Ecommerce.genericLibrary;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static Object[][] readExcel(String path, String sheetName) {
		FileInputStream f;
		Object[][] data = null;
		try {
			f = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f);
			Sheet sheet = book.getSheet(sheetName);
			int row = sheet.getPhysicalNumberOfRows();
			int cell = sheet.getRow(0).getPhysicalNumberOfCells();
			data = new Object[row - 1][cell];
			for (int i = 1; i <= row; i++) {
				for (int j = 0; j < cell; j++) {
					data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
