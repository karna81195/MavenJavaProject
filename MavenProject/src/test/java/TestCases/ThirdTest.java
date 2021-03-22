package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	
	
	static String list=null;
	static String table=null;
	static String country=null;
	
	@Test
	public void Test() throws InterruptedException {
		
		
		//Launch Chrome Browser
		WebDriver driver = new Browser().openDriver();
		System.out.println("Executing Third Test"+ "\n");
		try {
			
			driver.manage().window().maximize();
			//Launch HTML page (provide path that HTML page contains)
			driver.get("file:///V://CaseStudy//AutomationChallengeIDC (1)/index.html");
			
			driver.navigate().refresh();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			country="USA";
			
			//Search for Country USA in the table
			driver.findElement(By.xpath("//*[@id='searchMe']")).sendKeys(country);
			
			
			int j=0;
			for(int i=1;i<5;i++)
			{
				
				list=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/table/tbody/tr["+ i +"]/td[3]")).getText();
				
				if(list.equalsIgnoreCase(country)) {
					
					++j;
				} else { 
					System.out.println("Searching for Table with Country USA" + "\n" );
					}
				
				
			}
			System.out.println("Number of tables with country USA  " + j + "\n");
			
			
			driver.findElement(By.xpath("//*[@id='searchMe']")).clear();
			
			//Loop to verify the number of tables displayed
			int i=1;int k=0;
			Boolean present=true;
			while(present!=false) {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				try {
				
				 driver.findElement( By.xpath("/html/body/div/div[3]/div/div/table/tbody/tr[" + i + "]"));
			 present=true;
			 ++i;
			 k++;
				}catch (NoSuchElementException e) {
					   present = false;
				}
				 
				}
			
			System.out.println("Total Number of Tables :- "+k + "\n");
			
			
			
		} catch (Exception e) {
			System.out.println("Exception in Third Test"+ e);
		}
		
		driver.close();
	}
	
}
