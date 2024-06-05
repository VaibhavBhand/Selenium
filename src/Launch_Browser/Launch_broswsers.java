package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_broswsers
{
	public static void main(String[] args) throws InterruptedException 
	{
		//EdgeDriver driver = new EdgeDriver(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(5000);
		
		//driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		
		
		
		
		
		
		
	}
	
	
}
