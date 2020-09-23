package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\\\Users\\\\GOPAL NAMASIVAYAM\\\\Desktop\\\\webderivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().deleteAllCookies();
		//dyanamic wait are page loadtimeout and implicitwit as if element found with in 5 secs rest of the seconds will be ignored 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//max time to get the page load
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);//max time to get the elelments in the page load
		
		driver.switchTo().frame(0);//this page contains only one frame.
		Actions action =new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release().build().perform();
		Thread.sleep(3000);
	}

}
