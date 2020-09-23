package GreensPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		 * driver.get(" https://www.facebook.com/ ");
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
		 * "Gopal.stag@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("namasivayam");
		 * //driver.findElement(By.xpath("//button[@name='login']")).click();
		 * driver.navigate().to("https://www.redbus.in/");
		 * driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		 * driver.findElement(By.id("dest")).sendKeys("Vasudevanallur");
		 * driver.navigate().to("https://www.google.com/");
		 * driver.findElement(By.name("q")).sendKeys("GreensTechnology");
		 */
		 
		/*
		 * driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
		 * Thread.sleep(2000); driver.findElement(By.id("DUMMY1")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']")
		 * ).sendKeys("Gopal");
		 */
		
		/*
		 * driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		 * driver.switchTo().frame("login_page");
		 * driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys(
		 * "Gopal");
		 */
		
		
		  //driver.navigate().to("https://www.swiggy.com/"); Thread.sleep(2000);
		 // driver.findElement(By.xpath("//input[@class='_381fS _1oTLG _3BIgv' and @id='location']")).sendKeys("AnnaNagar");
		 
		
		//driver.navigate().to("https://www.snapdeal.com/login");
		//driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly' or @name='username' or @id='userName']")).sendKeys("Gopal");
		
		/*
		 * driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopal");
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gopal");
		 */
		
		/*
		 * driver.navigate().to("http://demo.automationtesting.in/Register.html");
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
		 * "Gopal");
		 * driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
		 * "Namsivayam"); driver.findElement(By.
		 * xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).
		 * sendKeys("five star apartments"); driver.findElement(By.
		 * xpath("//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched']"
		 * )).sendKeys("gopal.stag@gmail.com"); driver.findElement(By.
		 * xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']"
		 * )).sendKeys("9444502802");
		 * driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("Tamil,English");
		 * driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Gopal"
		 * ); driver.findElement(By.id("secondpassword")).sendKeys("Gopal");
		 */
		driver.get("http://adactinhotelapp.com/");
		//driver.navigate().to("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gopal");
	}
	
}
