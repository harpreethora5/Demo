package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

// Launch Browser

public class Program1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriverManager.edgedriver().setup();
	   WebDriver driver = new EdgeDriver();
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	}
	
}
