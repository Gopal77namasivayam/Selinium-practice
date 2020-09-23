package GreensPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://www.greenstechnologys.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}

//Close() - It is used to close the browser or page currently which is having the focus.
//Quit() - It is used to shut down the web driver instance or destroy the web driver instance(Close all the windows)
