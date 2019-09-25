package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;

public class TestDataUtil {

	
	@DataProvider(name = "loginTest")
	public static Object[][] loginTestData() throws Exception {
		Object[][] retObjArr = getExcelData(System.getProperty("user.dir")
				+ "//src//test//resources//TestData//Data.xls", "loginTest");
		return (retObjArr);
	}
	

	public static Object[][] getExcelData(String fileName, String sheetName) {

		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols];
			System.out.println("Total_TestDataSets: "+arrayExcelData.length);
			for (int i = 1; i < totalNoOfRows; i++) {

				for (int j = 0; j < totalNoOfCols; j++) {
					arrayExcelData[i - 1][j] = sh.getCell(j, i).getContents();
					System.out.println(sh.getCell(j, i).getContents());

				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}

}
