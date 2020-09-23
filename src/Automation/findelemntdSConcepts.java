package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelemntdSConcepts {

	public static void main(String[] args) throws java.lang.IndexOutOfBoundsException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		List<WebElement> List = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links is: "+List.size());
		for(int i=0;i<=List.size();i++)
		{
			String name=List.get(i).getText();
			System.out.println(name);
		}
	}

}
