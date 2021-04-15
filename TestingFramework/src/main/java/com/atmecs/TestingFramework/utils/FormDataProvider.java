package com.atmecs.TestingFramework.utils;



import org.testng.annotations.DataProvider;

import com.atmecs.TestingFramework.Xls_Reader;



public class FormDataProvider {


	Xls_Reader provider;
	
	@DataProvider(name = "idData")
	public Object[][] testData() {
		provider=new Xls_Reader("C:\\Users\\Anamika.Mathur\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\TestingFramework\\resources\\testData\\testId.xlsx");
		Object[][] data =getData(provider);
		return data;
	}
	
	
	@DataProvider(name = "konkoData")
	public Object[][] konkoData() {
		provider=new Xls_Reader("C:\\Users\\Anamika.Mathur\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\TestingFramework\\resources\\testData\\testKanko.xlsx");
		Object[][] data =getData(provider);
		return data;
	}


	
	public Object[][] getData(Xls_Reader provider) {
		
		int sheetIndex=0;
		int rowNo= 1;
		int rowCount = provider.totalRowsinSheet(sheetIndex);
		int colCount = provider.totalColsinSheet(sheetIndex,rowNo);

		Object[][] data = new Object[rowCount][colCount];

		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
			for (int colIndex = 0; colIndex < colCount; colIndex++) {

				data[rowIndex][colIndex] = provider.getData(sheetIndex, rowIndex + 1, colIndex);
				
			}
		}
		
		return data;
		
	}
	
}
