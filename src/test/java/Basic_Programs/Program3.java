package Basic_Programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3 
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver", ".\\src\\test\\java\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   driver.manage().window().maximize();
	   WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
	   Select s = new Select(men);
	   List<WebElement> l = s.getOptions();
	   for(WebElement opt: l)
		   System.out.println(opt.getText());
   }
}
