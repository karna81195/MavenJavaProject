package TestCases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.Point;

import org.testng.annotations.Test;


public class FourthTest {
	
	
	
	@Test
	public void Test() throws InterruptedException  {
		//Launch Chrome Browser
		WebDriver driver = new Browser().openDriver();
		System.out.println("Executing Fourth Test"+ "\n");
	try {
		driver.manage().window().maximize();
		
		//Launch HTML page (provide path that HTML page contains)
		driver.get("file:///V://CaseStudy//AutomationChallengeIDC (1)/index.html");
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action=new Actions(driver);
		
		
		// Finding draggable element
		WebElement drag=driver.findElement(By.xpath("//*[@id='drag1']"));
		//int x=drag.getLocation().getX();
		//int y=drag.getLocation().getY();
		
	
		
		
		// Finding droppable element
		WebElement drop=driver.findElement(By.xpath("//*[@id='div1']"));
		Point point = drop.getLocation();
		//int xcord = point.getX();
		//int ycord = point.getY();
		//int x1=drag.getLocation().getX();
		//int y1=drag.getLocation().getY();
		
	
		//Perform drag and drop
		try
		{
			action.dragAndDrop(drag,drop).build().perform();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath("//*[@id='div1']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		if(element.isDisplayed())
		{
			System.out.println("Draggable Element Displayed"+ "\n");
		}
		else {
			
			System.out.println("Dropped Element Missing"+ "\n");
		}
	}		catch (Exception e) {
		System.out.println("Exception in Fourth Test "+e+ "\n");
	}  
	
	driver.close();
	}
}
