package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

// Xpath by traversing

public class Program6 
{
	public static void main(String[] args) 
	{
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/s?k=mobile&crid=3GTUV2NVLKKMK&sprefix=mobile%2Caps%2C218&ref=nb_sb_noss_1");
        WebElement price = driver.findElement(By.xpath("//span[text()='Samsung Galaxy A34 5G (Awesome Graphite, 8GB, 256GB Storage) | 48 MP No Shake Cam (OIS) | IP67 | Gorilla Glass 5 | Voice Focus | Travel Adapter to be Purchased Separately']/../../../../../..//span[@class='a-price-whole']"));
        System.out.println(price.getText());
	}

}
