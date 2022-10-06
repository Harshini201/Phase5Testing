package phase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_up");

		WebElement user_full_name = driver.findElement(By.id("user_full_name"));
		user_full_name.sendKeys("Harshiniarasu");
		WebElement user_email_login = driver.findElement(By.id("user_email_login"));
		
		user_email_login.sendKeys("harshinia@gmail.com");
		
		WebElement user_password = driver.findElement(By.id("user_password"));
		
		user_password.sendKeys("1234567");
		
	     WebElement user_submit = driver.findElement(By.id("user_submit"));
		
		user_submit.click();
	}
}
