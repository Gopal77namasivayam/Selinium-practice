package Automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptHighlight {
	static WebElement element;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='Register']")).click();
		WebElement login=driver.findElement(By.xpath("//input[@id='Register']"));
		//flash(login,driver);
		drawBorder(login,driver);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\SS\\borderscreenshot.png"));
		generateAlert(driver,"There is an issue with create button");
		driver.switchTo().alert().accept();
		clickElement(driver,login);
		driver.switchTo().alert().accept();
		//driver.navigate().refresh();//by using navigate
		refershPage(driver);//by using JS script
		System.out.println(getTitle(driver));//to get the page  title
		//driver.quit();
		//System.out.println(pageInnertext(driver));// to get page inner text
		driver.get("https://www.rediff.com/");
		//scrollPagedown(driver);
		WebElement cricket =driver.findElement(By.xpath("//a[contains(text(),'More Cricket & Sports')]"));
		scrollIntoView(cricket,driver);
		
	}
	
	public static void flash(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgclour=element.getCssValue("backgroundColor");
		System.out.println(bgclour);
		for(int i=0;i<100;i++)
		{
		//changeColor("255, 0, 0, 0.3)",element,driver);
		changeColor(element,driver);
		}
	}
	
	public static void changeColor(WebElement element,WebDriver driver)
	{
		System.out.println("in change color method method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 10px solid red;');",element);
		try
		{
			Thread.sleep(200);
		}catch(InterruptedException e)
		{
			
		}
	
	
	}
	public static void drawBorder(WebElement element,WebDriver driver)
	{
		System.out.println("in border method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",element);
	}
	public static void generateAlert(WebDriver driver, String messgae)
	{
		System.out.println("in generatealert method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+messgae+"')");
	}
	public static void clickElement(WebDriver driver,WebElement element)
	{
		System.out.println("in clickelement method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",  element);
	}
	public static void refershPage(WebDriver driver)
	
	{
		System.out.println("in refresh method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	public static String getTitle(WebDriver driver)
	{
		System.out.println("in get title method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
		
	}
	
	public static String pageInnertext(WebDriver driver)
	{
		System.out.println("in page inner text method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String pagetext=js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
	}
	
	public static void scrollPagedown(WebDriver driver)
	{
		System.out.println("in page scroll method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver)
	{
		System.out.println("in page scrollintoView method");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
//JavascriptExecutor is a class and executeScript used to execute their script