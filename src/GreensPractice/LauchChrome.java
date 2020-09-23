package GreensPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.greenstechnologys.com/");
		driver.navigate().to("https://www.facebook.com/");		
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	
	

}
