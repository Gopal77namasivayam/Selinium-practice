package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchBrowser {
	public static void main(String[] args) {
		
		//WebDriver driver=new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();		
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		if(title.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		
		else
		{
			System.out.println("Incorrect Title");
		}
		driver.close();
		//driver.quit();
//ChromeDriver, EdgeDriver, EventFiringWebDriver, FirefoxDriver, InternetExplorerDriver, OperaDriver, RemoteWebDriver, SafariDriver
	

}
	}
