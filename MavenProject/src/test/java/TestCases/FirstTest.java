package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTest {


	
//Test case 1
@Test
public void test() throws InterruptedException  {
	
	//Launch Chrome Browser
	WebDriver driver = new Browser().openDriver();
	
	System.out.println("Executing First Test"+ "\n");
	try {
		
		driver.manage().window().maximize();
		
		//Launch HTML page (provide path that HTML page contains)
	driver.get("file:///V://CaseStudy//AutomationChallengeIDC (1)/index.html");
	
	driver.navigate().refresh();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id='test-1-div']/button")).click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//Enter below values
	String enteredName= "Revolver";
	String enteredCity= "Hyderabad";
	
	System.out.println("Entering Name "+ enteredName+ "\n");
	System.out.println("Entering City "+ enteredCity+ "\n");
	
	
	driver.findElement(By.xpath("//*[@id='name']")).sendKeys(enteredName);
	
	driver.findElement(By.xpath("//*[@id='city']")).sendKeys(enteredCity);
	
	driver.findElement(By.xpath("//*[@id='enter']")).click();
	
	driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[1]/button")).click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//Get the text and store in a variable
	String actualName = driver.findElement(By.xpath("/html/body/div/div[1]/div/span[1]")).getText();
	
	String actualCity = driver.findElement(By.xpath("/html/body/div/div[1]/div/span[2]")).getText();
	
	
	//Verify if the name and city matches
	if(enteredName.contentEquals(actualName) && enteredCity.contentEquals(actualCity) ) {
		System.out.println("Provided Name and city exists"+ "\n");
	}
	else
		System.out.println("Missing name and city"+ "\n");
	
	}catch(Exception e) {
		System.out.println("Exception in First Test "+e+ "\n");
	}
	
	driver.close();
		
}
}
