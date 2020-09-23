package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fin.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fin.ebay.com%252F");
		//1.Xpath. will not be useful if it is hierchial based otherise useful e can use as third priority
		//absolute xpath should not be used ex- html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/d
		//only realtive xpath need to be used-//input[@name='checkbox-default']
		//driver.findElement(By.xpath( "//input[@id='firstname']")).sendKeys("Gopal");
		//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Namasivayam");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Gopal.stag@gmail.com");
		//driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Namasivayam");
		//2.ById -- this first priority
		//driver.findElement(By.id("firstname")).sendKeys("Gopal");
		//driver.findElement(By.id("lastname")).sendKeys("Raja");
		//3.Byname --second prioroty
		//driver.findElement(By.name("firstname")).sendKeys("Gopal");
		//driver.findElement(By.name("lastname")).sendKeys("success");
		//driver.quit();
		//4.link text 
		driver.findElement(By.linkText("Sign in")).click();
		//5.partial link Test
		driver.findElement(By.partialLinkText("Create a")).click();
		//6.cssSelector--rightclick on input and copy paste the value or put # near id value if if class available put . and id like.id value//second proirty
		driver.findElement(By.cssSelector("#email")).sendKeys("Gopal.stag@gmail.com");
		//7.class not useful because class name may be dupliate
		driver.findElement(By.className("checkbox__control")).click();

}
}
