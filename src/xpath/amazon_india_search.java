package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_india_search {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		/*WebElement sb = driver.findElement(By.id("twotabsearchtextbox"));
		sb.sendKeys("nike shoes");*/
		
		WebElement searchb = driver.findElement(By.xpath("(//input)[5]"));
		searchb.sendKeys("nike");
		searchb.sendKeys(Keys.ENTER);
	}

}
