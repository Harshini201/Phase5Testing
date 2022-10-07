package phase5;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Testautomate {
	WebDriver driver;
  @SuppressWarnings("deprecation")
@Test(priority = 1)
  public void Registeration ()throws InterruptedException {
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.findElement(By.cssSelector("#nav-link-accountList")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.cssSelector("#createAccountSubmit")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Harshiniiiii");
	 Thread.sleep(5000);
	 driver.findElement(By.cssSelector("#ap_phone_number")).sendKeys("1234567890");
	 Thread.sleep(5000);
	 driver.findElement(By.cssSelector("#ap_password")).sendKeys("Hars123");
	 Thread.sleep(5000);
	 driver.findElement(By.cssSelector("#continue")).click();
	 
  }
  @Test(priority = 2)
  public void sigin()throws InterruptedException{

		 driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		 Thread.sleep(5000);
	     driver.findElement(By.cssSelector("#ap_email")).sendKeys("klmn@gmail.com");
	     Thread.sleep(5000);
		  driver.findElement(By.cssSelector("#continue")).click();
		  Thread.sleep(5000);
	     driver.findElement(By.cssSelector("#ap_password")).sendKeys("1234567890");  
	     Thread.sleep(30000);
  }
 
@Test(priority = 3)
  public void addToCart() throws InterruptedException {
	  
      	
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	  
	    driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("oneplusnordce2 5g");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("#nav-search-submit-button")).submit();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("OnePlus Nord CE 2 5G (Gray Mirror, 8GB RAM, 128GB Storage)")).click();
	    //Thread.sleep(5000);

		//WebDriverWait wait = new WebDriverWait(driver, 30);
	   // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();
	    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     //Dimension b= driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).getSize();
	    
	    Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
	    //driver.findElement(By.cssSelector("#add-to-cart-button")).click();
	    Thread.sleep(5000);
	    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshini Arasu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
    	driver.get("https://www.amazon.in/");
    
    	   
  }



    @AfterMethod
  public void afterMethod()
  {
      driver.quit();
  }

}
