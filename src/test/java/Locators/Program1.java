package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

// id_name_linktext_partialLinkText

public class Program1 
{
   public static void main(String[] args) throws InterruptedException 
   {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).sendKeys("harpreet.hora5");
	 driver.findElement(By.name("pass")).sendKeys("Testing@123");
	 driver.findElement(By.name("login")).click();
	 Thread.sleep(2000);
	 // driver.findElement(By.linkText("Forgotten password?")).click();
	 // driver.findElement(By.partialLinkText("Create new ")).click();
   }
}
