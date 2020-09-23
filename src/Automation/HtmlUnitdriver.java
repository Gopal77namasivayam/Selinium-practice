package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitdriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		System.out.println(driver.getTitle());
		
	}

}

//HtmlUnitDriver not available after selinium 3.0
//to use this concept pls down load HtmlUnitDriver jar file and add it into ref lib using add external jar

// testing is behind the scene, no browser launched
//execution of testcases is very fast
//not suitable for Acton class like  mouse movement,mouse click

