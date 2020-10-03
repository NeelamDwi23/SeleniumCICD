package edureka.devops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginEdureka 
{
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Neelam\\CICD_Selenium\\devops\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		WebElement loginbtn = driver.findElement(By.xpath("//a[@data-button-name=\"Login\"]"));
		loginbtn.click();
		WebElement email = driver.findElement(By.xpath("(//input[@name='data[User][email]'])[2]"));
		 email.sendKeys("testuser@gg.com");
		 WebElement password =driver.findElement(By.xpath("(//input[@name='data[User][password]'])[2]"));
			password.sendKeys("mypassword");



				
			
	}
}
