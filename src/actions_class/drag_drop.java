package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement json = driver.findElement(By.xpath("//div[@id='container-10']"));
		WebElement github = driver.findElement(By.xpath("//div[@id='container-4']"));
		WebElement c = driver.findElement(By.xpath("//img[@id='drag1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a1 = new Actions(driver);
		
		a1.dragAndDrop(json, drop).perform();
		a1.dragAndDrop(drop, json).perform();
		
		a1.dragAndDrop(github, drop).perform();
		a1.dragAndDrop(drop, github).perform();
		
		//a1.dragAndDrop(c, drop);
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
