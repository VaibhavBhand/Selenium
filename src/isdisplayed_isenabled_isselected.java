import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_isenabled_isselected
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.name("q"));
		if (s.isDisplayed() && s.isEnabled())
		{
			s.sendKeys("India");
		}
		

	}

}
