package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

// Xpath by group by index

public class Program5 
{
   public static void main(String[] args) 
   {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.skillrary.com/");
	 driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
   }
}
