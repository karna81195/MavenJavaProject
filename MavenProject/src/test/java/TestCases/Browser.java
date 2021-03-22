package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public WebDriver openDriver() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"BrowserDrivers//chromedriver.exe");
		WebDriver chromeDriver= new ChromeDriver();
		
		return chromeDriver;
		
	}

}
