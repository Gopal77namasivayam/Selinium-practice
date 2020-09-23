package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//handling select dropdown and crateing  select classs object
		//Select select=new Select(driver.findElement(By.id("select-demo")));
		
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		select.selectByVisibleText("Monday");
		//driver.findElement(By.linkText("Input Forms")).click();
		//driver.findElement(By.linkText("Simple Form Demo")).click();
		//driver.findElement(By.id("user-message")).sendKeys("Hello Automation");
		//driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		
		//driver.quit();

}
}
