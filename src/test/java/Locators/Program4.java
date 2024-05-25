package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Xpath

public class Program4 
{
	public static void main(String[] args) 
	{
       WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();
       driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("harpreet.hora5");   //Xpath by attribute
       driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Testing@123&"); //Xpath by contains(Xpath by attribute) 
       // driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); //Xpath by text
       driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click(); // Xpath by contains (Xpath by text)
       
       
	}

}
