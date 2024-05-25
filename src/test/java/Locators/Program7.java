package Locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Xpath Ancestor

public class Program7 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://www.amazon.in/s?k=samsung+mobile&crid=1J3SYH60O7VBQ&sprefix=sa%2Caps%2C207&ref=nb_sb_ss_inft-rank-pairwise-override-in-t3_1_2");
       Thread.sleep(3000);
       WebElement price = 
       driver.findElement(By.xpath("//span[text()='Galaxy A34 5G (Awesome Violet, 8GB, 256GB Storage) | 48 MP No Shake Cam (OIS) | IP67 | Gorilla Glass 5 | Voice Focus | Travel Adapter to be Purchased Separately']/ancestor::div[@class='a-section']//span[@class='a-price-whole']"));
       System.out.println(price.getText());
	}

}

