package TestCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
	
	ArrayList<String> arrayList = new ArrayList<String>(); 
	static String list=null;
	
	
	@Test
	public void test() throws InterruptedException {
		
		//Launch Chrome Browser
		WebDriver driver = new Browser().openDriver();
		
		System.out.println("Executing Second Test"+ "\n");
		try {
			
		driver.manage().window().maximize();
		
		
		//Launch HTML page (provide path that HTML page contains)
		driver.get("file:///V://CaseStudy//AutomationChallengeIDC (1)/index.html");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@id='test-2-div']/div/div/button")).click();
		
		//Find all search options and store in an array
		arrayList.add("Java");
		arrayList.add("C#");
		arrayList.add("Python");
		arrayList.add("Angular 2");
		arrayList.add("Angular");
		
		//Loop to verify if all search options are displayed
		for(int i=1;i<6;i++)
		{
			list=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/ul/li["+i+"]")).getText();
			
			if(arrayList.get(i-1).contentEquals(list)) {
				System.out.println("String verified  "+ "\n");
			} else System.out.println("String not found"+ "\n");
			
			System.out.println(list+ "\n");
		}
		String angular="Angular";
		System.out.println("Searching string that contains "+ angular+ "\n");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/ul/input")).sendKeys(angular);
		
		//Loop to verify if search options with Angular are present
		for(int i=1;i<6;i++)
		{
			list=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/ul/li["+i+"]")).getText();
			
			if(list.contains(angular)) {
				System.out.println(" Searched string verified  "+ list+ "\n");
			} else {
				System.out.println(" Searched string is not "+ arrayList.get(i-1)+ "\n");
			}
			
			
		}
		String reactJs="ReachJs";
		System.out.println("Searching string that contains  "+ reactJs+ "\n");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/ul/input")).clear();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/ul/input")).sendKeys(reactJs);
		
		//Loop to verify if no option is available as ReactJs
		for(int i=1;i<6;i++)
		{
			list=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/ul/li["+i+"]")).getText();
			
			if(list.isEmpty()) {
				System.out.println(" Search Not Found "+ "\n");
			} else {
				System.out.println(" Search Found" + list+ "\n");
			}
			
			
			
		}
		System.out.println(reactJs+" Option is Not Available  ");
		}
		catch(Exception e){
			System.out.println("Exception in Second Test "+e+ "\n");
		}
	
		driver.close();
	}
	
	
}
