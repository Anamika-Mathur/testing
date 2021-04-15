package com.atmecs.TestingFramework.constatnts;

import java.io.File;

public class FileConstants {

	public final static String USER_HOME= System.getProperty("user.dir")+File.separator;
	
	public final static String LIB_HOME =USER_HOME+"lib"+File.separator;
	
	public final static String CHROME_PATH= LIB_HOME+"chromedriver.exe";
	public final static String FIREFOX_PATH= LIB_HOME+"geckodriver.exe";
	public final static String INTERNETEXPLORER_PATH= LIB_HOME+"IEDriverServer.exe";
	public static final String TESTDATA_FILE = "C:\\Users\\Anamika.Mathur\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\TestingFramework\\resources\\testData";

	public static final long EXPLICIT_WAIT = 30;

	public static final long FLUENT_WAIT = 30;

	public static final long PAGE_LOAD_TIME = 30;

	public static final long FLUENT_POLL = 1;

	public static String lOCATORS_FILE;

}
