import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_shoe_flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		try {
            WebElement closeButton = driver.findElement(By.className("_30XB9F"));
            closeButton.click();
        } catch (Exception e) {
            // No login popup appeared
        }
		
		WebElement e = driver.findElement(By.className("Pke_EE"));
		e.sendKeys("shoes");
		e.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		WebElement b = driver.findElement(By.xpath("(//div[@class='wvIX4U'])[1]"));
		b.click();
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
