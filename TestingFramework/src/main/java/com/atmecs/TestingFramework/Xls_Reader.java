package com.atmecs.TestingFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Xls_Reader {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public Xls_Reader(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInput = new FileInputStream(file);
			try {
				workbook = new XSSFWorkbook(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public String getData(int index, int rowNum, int cellNum) {
		
		sheet = workbook.getSheetAt(index);
		String data = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
			return data;
	}
	public   int totalRowsinSheet(int sheet) {
		int rowCount = workbook.getSheetAt(sheet).getLastRowNum();
		return rowCount;
	}
	
	public int totalColsinSheet(int sheetIndex,int rowCount) {
		int colCount = workbook.getSheetAt(sheetIndex).getRow(rowCount).getLastCellNum();
		return colCount;
	}
	
}
