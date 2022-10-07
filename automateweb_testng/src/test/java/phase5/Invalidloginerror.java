package phase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invalidloginerror {
	
	WebDriver driver;
  @Test
  public void Invalid () throws InterruptedException {
	  driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		 Thread.sleep(20000);
		  driver.findElement(By.cssSelector("#ap_email")).sendKeys("klmn@gmail.com");
		  Thread.sleep(20000);
		  driver.findElement(By.cssSelector("#continue")).click();
		  Thread.sleep(20000);
		  driver.findElement(By.cssSelector("#ap_password")).sendKeys("12345"); 
		  driver.findElement(By.cssSelector(" #signInSubmit")).click();
		  Thread.sleep(20000);
		 System.out.println (driver.findElement(By.cssSelector("#auth-error-message-box > div > h4")).getText()); 
		
    }
  
  @BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
  @AfterMethod
	public void afterMethod() {
		//driver.close();
		driver.quit();
	}
}
