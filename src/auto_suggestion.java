import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.name("q"));
		if (s.isDisplayed() && s.isEnabled())
		{
			s.sendKeys("India");
			Thread.sleep(2000);
		}
		List<WebElement> as = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = as.size();
		System.out.println(count);
		as.get(4).click();
		
		
		
		

}}
