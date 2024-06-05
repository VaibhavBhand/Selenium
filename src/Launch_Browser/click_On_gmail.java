package Launch_Browser;

import org.openqa.selenium.edge.EdgeDriver;

public class click_On_gmail 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

}
