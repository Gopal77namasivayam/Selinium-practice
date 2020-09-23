package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		Thread.sleep(2000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parent=it.next();
		String child=it.next();
		System.out.println("Parent window id is:"+parent);
		System.out.println("Child window id is:"+child);
		driver.switchTo().window(child);
		Thread.sleep(2000);
		System.out.println("Child window title is:" +driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("parent window title is:"+driver.getTitle());
		driver.close();
	}

}

//close will close the specific browser window and quit will close all the opened browser window
