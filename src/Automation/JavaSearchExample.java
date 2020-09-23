package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSearchExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
		List<WebElement> Childelements = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("total no of suggestion in list box:==> "+ Childelements.size());
		for(int j=0;j<Childelements.size();j++)
		{
			System.out.print(Childelements.get(j).getText()+" ");
		}
		
		
		for(int i=0;i<Childelements.size();i++)
		{
			
			if(Childelements.get(i).getText().contains("javascript"))
			{
				Childelements.get(i).click();
				break;
			}
		}
	
	}

}

/*
 * Steps: 1. Google Search – pick a value from suggestions 
 * 2. Search using Xpath use findelements and descendant
 * 3. Get the total count of suggestions 
 * 4. Use if condition to match the value
 * 5. Click on matched value
 */

