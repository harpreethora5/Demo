package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

// Navigation

public class Program2 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.amazon.in/");
	 Thread.sleep(2000);
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 driver.close();
  }
}
