import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion_amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		s.sendKeys("shoe");
		Thread.sleep(2000);
		
			
		List<WebElement> as = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = as.size();
		System.out.println(count);
		
		as.get(4).click();

	}

}
