package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoosiginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		System.out.println("The search for :"+driver.getTitle());
		WebElement searchIcon = driver.findElement(By.id("usernamereg-fullname"));//id locator for next button
        
        searchIcon.click();
    System.out.println(searchIcon.getAttribute("title"));
		
	}

}
