package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
  
public class BootstrapMenu {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\\\Users\\\\GOPAL NAMASIVAYAM\\\\Desktop\\\\webderivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=131.0_1");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'jQuery')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Sliders')]")).click();
		
		
	}

}
