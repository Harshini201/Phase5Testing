package phase5;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sigin {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		
		WebElement username = driver.findElement(By.id("user_email_login"));
		WebElement password = driver.findElement(By.id("user_password"));
		WebElement login = driver.findElement(By.id("user_submit"));
		
		username.clear();
		username.click();
		username.sendKeys("harshinia@gmail.com");
		
		password.clear();
		password.click();
		password.sendKeys("1234567");
		//driver.switchTo().alert().dismiss();
		login.click();
		
		/*String actualUrl = "https://live.browserstack.com/dashboard";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);*/
	}
	
	
}
