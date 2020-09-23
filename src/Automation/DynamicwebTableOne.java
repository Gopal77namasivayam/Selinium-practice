package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicwebTableOne {
	public static void main(String[] args) throws InterruptedException
 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("gopal77namasivayam@gmail.com");
		driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys("Namasivayam");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//td[contains(text(),'gopal')]/parent::tr//td//div//input[@name='id']")).click();
		WebElement chk=driver.findElement(By.xpath("//td[contains(text(),'ramasubu')]/parent::tr//td//div//input[@name='id']"));
		clickElement(driver,chk);
				//System.out.println(a);
		//driver.findElement(By.xpath("//td[contains(text(),'gopal')]/parent::tr//preceding-sibling::td//div//input[@name='id']"));
		//System.out.println(name1);
		//driver.close();
		/*
		 * String beforeXpath="//tr["; String afterXpath="]//td[1]//a[1]";
		 * 
		 * for(int i=1;i<=26;i++) {
		 * 
		 * String name=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
		 * System.out.println(name); if(name.contains("Capital First")) {
		 * driver.findElement(By.xpath(beforeXpath+i+afterXpath)).click();
		 * System.out.println("tc is pass"); }
		 * 
		 * }
		 */
	}
	
	
	  public static void clickElement(WebDriver driver,WebElement element) {
	  System.out.println("in clickelement method");
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].click();", element); }
	 
}
//ex for preceding sibling //td[contains(text(),'ramasubu')]/parent::tr//preceding-sibling::tr//td//div//input[@name='id']
//forward-sibling
