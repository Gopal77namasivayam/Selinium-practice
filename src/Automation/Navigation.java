package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();//refiff
		Thread.sleep(1000);
		driver.navigate().forward();//google
		driver.navigate().refresh();//refresh google
		
		//getVs navigate -both are used to luanch url but using navigate we launch external url from current and perform various operatoins like forward,back and refresh

	}
	
}
