package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\ecli\\Selinium\\src\\Automation\\Config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("browser"));
		String BrowserName= prop.getProperty("browser");
		String Url= prop.getProperty("URL");
		String name= prop.getProperty("name");
		String age= prop.getProperty("age");
		
		if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get(prop.getProperty("URL"));
		
		//
		//driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		Thread.sleep(2000);
		//driver.switchTo().frame("metric_iframe");
		//driver.findElement(By.xpath("")).sendKeys("opal");
		
		driver.findElement(By.xpath(prop.getProperty("Full_Name_Xpath"))).sendKeys(prop.getProperty("Full_Name"));
		driver.findElement(By.xpath(prop.getProperty("Choose_a_Rediffmail_Xpath"))).sendKeys(prop.getProperty("Rediffmail_ID"));
		driver.findElement(By.xpath(prop.getProperty("Password_Xpath"))).sendKeys("password");
	}

}
