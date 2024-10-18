package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_AbsoluteXpath_AllElements_JSAMapp_
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vaibh/Downloads/learningHTML1.html");
		
				WebElement Username =	driver.findElement(By.xpath("(/html/body/input)[1]"));
				Username.sendKeys("Vaibhav.bhand");
				
				WebElement hint =	driver.findElement(By.xpath("(/html/body/input)[2]"));
				hint.sendKeys("hint");
				
				WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
				password.sendKeys("abcd");
				
				WebElement name = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
				name.sendKeys("Vaibhav");
				
				WebElement checkbox = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
				checkbox.click();
				
				
	}

}
