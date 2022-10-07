package test;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class Register {
  
  @Test public static void main(String[] args) throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

		WebElement email = driver.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("harsha@gmail.com");
		
		
		WebElement password = driver.findElement(By.id("sView1:r1:0:password::content"));
		password.sendKeys("Harshini@201");
	
		
		WebElement repassword = driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		repassword.sendKeys("Harshini@201");
	
		
		WebElement country = driver.findElement(By.id("sView1:r1:0:country::content"));
		country.sendKeys("India");
		
		WebElement firstname = driver.findElement(By.id("sView1:r1:0:firstName::content"));
		firstname.sendKeys("Harshini");
		
		WebElement lastname = driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lastname.sendKeys("A");
		
		WebElement jobTitle = driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jobTitle.sendKeys("SE");
		
		WebElement workPhone = driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		workPhone.sendKeys("1234567890");
		
		WebElement companyName = driver.findElement(By.id("sView1:r1:0:companyName::content"));
		companyName.sendKeys("ABC Company");
		
		WebElement address = driver.findElement(By.id("sView1:r1:0:address1::content"));
		address.sendKeys("7th block,Annar Nagar,Chennai");
		
		WebElement city = driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Tamil Nadu");
		
		WebElement pinCode = driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		pinCode.sendKeys("645891");
		
		Thread.sleep(1000);
		WebElement register= driver.findElement(By.id("sView1:r1:0:b1"));
		register.click();
		
  }
}
