package Automation;
// in send keys give path of the file so that we can handle file upalod window
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\webderivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\GOPAL NAMASIVAYAM\\Desktop\\FileUpload.txt");
		Thread.sleep(1000);
		//driver.quit();
	}

}
// three type of file areAlert,fileuplaod,browserwindow