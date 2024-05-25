package Basic_Programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		Set<String> w = driver.getWindowHandles();
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		for(String wd : w)
		{ 
		  driver.switchTo().window(wd);
		  System.out.println(wd);
		}

		
		/*
		 * int arr[] = {1,2,3,4,5}; for(int i = 0; i<arr.length-2; ) {
		 * System.out.println(arr[i]+" "); }
		 */
	}
	
}


