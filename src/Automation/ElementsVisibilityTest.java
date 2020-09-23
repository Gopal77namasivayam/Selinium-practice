package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ElementsVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		boolean b1=driver.findElement(By.xpath("//input[@id='Register']")).isDisplayed();
		System.out.println(b1);
		boolean b2=driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();
		System.out.println(b2);
		 
		boolean b4=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("checkbox button"+ b4);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b5=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("checkbox button"+ b5);
		
		Select select =new Select(driver.findElement(By.id("country")));
		String s1=select.getFirstSelectedOption().toString();
		System.out.println(s1);
		boolean b7=select.getFirstSelectedOption().isSelected();
		System.out.println("dropdown defeault selectoin"+ b7);
	}

}

//isDisplayed() is the method used to verify a presence of a web element within the webpage.
//isEnabled() is the method used to verify if the web element is enabled or disabled within the webpage.
//isEnabled() is primarily used with buttons.
//isSelected() is the method used to verify if the web element is selected or not manly for dropdown,radio
