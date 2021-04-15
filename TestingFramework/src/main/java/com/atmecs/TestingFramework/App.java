package com.atmecs.TestingFramework;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Xls_Reader xr=new Xls_Reader("C:\\Users\\Anamika.Mathur\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\TestingFramework\\resources\\testData\\testId.xlsx");
      String data=xr.getData(0, 1, 0);
      System.out.println(data);
    }
}
