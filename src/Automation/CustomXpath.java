package Automation;

import java.util.concurrent.TimeUnit;
//Absoulte xpath  has performacne issue, anytime dev change it in future
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\\\Users\\\\GOPAL NAMASIVAYAM\\\\Desktop\\\\webderivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame("moneyiframe");
		//driver.findElement(By.xpath("//input[@id='query']")).sendKeys("Gopal");
		//driver.findElement(By.xpath("//input[@class='getquoteinput']")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[@id='query' or @class='getquoteinput']")).sendKeys("super");
		//driver.findElement(By.xpath("//input[starts-with(@class,'get')]")).sendKeys("startswith");
		//driver.findElement(By.xpath("//input[ends-with(@class,'getquoteinput')]")).sendKeys("endswith");
		//driver.findElement(By.xpath("//input[@id='query' and @class='getquoteinput']")).sendKeys("super dooper");
		//driver.findElement(By.xpath("//input[contains(@class,'get')]")).sendKeys("hello");
		//driver.findElement(By.xpath("//input[contains(@id,'qu')]")).sendKeys("raja");
		//for link
		//driver.switchTo().defaultContent();//used to retrun back from frmae to default content
		//driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		//driver.findElement(By.xpath("//a[starts-with(text(),'Cr')]")).click();
		driver.findElement(By.xpath("//a[ends-with(text(),' Account']")).click();
		
		
		//driver.findElement(By.partialLinkText("Create Account")).click();
	}
	

}
