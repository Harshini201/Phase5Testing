package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main (String[]args) {
	// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://login.yahoo.com/");
	
	        WebElement textfields=driver.findElement(By.tagName("input"));
	        System.out.println(textfields.getAttribute("class"));
	}

}
