import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
	public static void main(String[] args) throws InterruptedException  {
		//Invoke Chrome Driver
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\pradkumar\\Downloads\\Selenium+java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait - 5 second time out .. this is the maximum time till browser wait for the result  
		//if result is not load in this time duration then test case get failed.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// Id
		driver.findElement(By.id("inputUsername")).sendKeys("Pradyumna");
		// name
		driver.findElement(By.name("inputPassword")).sendKeys("jdfjdfj");
		// class name
		driver.findElement(By.className("signInBtn")).click();
		// cssSelector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		// linkText
		driver.findElement(By.linkText("Forgot your password?")).click();
		

		// xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pradyumna");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prar@itcence.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@gmail.com");
		// Customized locator
		driver.findElement(By.cssSelector("input[type='text']:nth-of-type(3)")).sendKeys("7756768984");
		driver.findElement(By.cssSelector("input[type='text']:nth-of-type(3)")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7756768454");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());	
		String text = driver.findElement(By.cssSelector("form p")).getText();
		String[] text1 = text.split("'",3);
		String correctPassword= text1[1];
	
		
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(correctPassword);
// 1 - web driver wait*********************************	
		//for delay the execution to avoid the element interception error -->avoid interruptedException
//		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("chkboxOne"))); 
// 2- Fluent wait *************************************	
//		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(Duration.ofSeconds(30L))
//			       .pollingEvery(Duration.ofSeconds(5L))
//			       .ignoring(ElementClickInterceptedException.class);
//
//			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//			       return driver.findElement(By.id("chkboxOne"));
//			     }
//			   });
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(5)) 			
				.ignoring(ElementClickInterceptedException.class);
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.id("chkboxOne"));
			}
		});
		
//		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
//		driver.findElement(By.xpath("\\button[@class='submit signInBtn']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //Regular expression
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		
	}
}
