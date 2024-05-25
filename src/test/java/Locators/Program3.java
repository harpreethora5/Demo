package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// CSSSelector

public class Program3 
{
	public static void main(String[] args) 
	{
       WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       driver.findElement(By.cssSelector("input[id='email']")).sendKeys("harpreet.hora5");
	}
}
