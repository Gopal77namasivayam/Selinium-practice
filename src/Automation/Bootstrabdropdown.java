package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Bootstrabdropdown {
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-info btn-sm dropdown-toggle')]")).click();
			List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//label"));
			System.out.println("Total no of list items: "+ list.size());
			for(int j=0;j<list.size();j++)
			{
				System.out.println(list.get(j).getText()+ "  ");
			}
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getText().contains("HTML"))
				{
					list.get(i).click();
					System.out.println("item needs to cheked is: "+list.get(i).getText());
					break; 
				}
				
			}
		}
	}

}

