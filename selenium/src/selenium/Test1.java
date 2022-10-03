package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.yahoo.com/");
		System.out.println("The title of the page is :"+driver.getTitle());
		WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
        
        searchIcon.click();
    System.out.println(searchIcon.getAttribute("value"));
		
	}

}
