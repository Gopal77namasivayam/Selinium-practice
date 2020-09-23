package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#pass_div > input:nth-child(10)")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		Thread.sleep(1000);
		if(text.equals("Please enter valid email"))
		{
			System.out.println("correct error message");
		}
		else
		{
			System.out.println("In-correct error message");
		}
			
		alert.accept();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
		
	}
	

}
