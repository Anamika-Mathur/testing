package webconnection;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridConnection {
	
	public static URL url;
	String nodeurl;
	
	public WebDriver getConnection(WebDriver driver,String browser) {
		
		nodeurl="http://192.168.1.10:4444/wd/hub";
		
		DesiredCapabilities capability=new DesiredCapabilities();
		
		try {
			url=new URL(nodeurl);
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		
		if (browser.equalsIgnoreCase("chrome")) {
			capability=DesiredCapabilities.chrome();
			capability.setBrowserName(browser);
		} else if (browser.equalsIgnoreCase("firefox")) {
			capability=DesiredCapabilities.firefox();
			capability.setBrowserName(browser);
		} else if (browser.equalsIgnoreCase("internet explorer")) {
			capability=DesiredCapabilities.internetExplorer();
			capability.setBrowserName(browser);
		} else {
			System.out.println("Driver not found in the config file");
		}
		
		capability.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(url,capability);
		
		return driver;
		
	}


}
