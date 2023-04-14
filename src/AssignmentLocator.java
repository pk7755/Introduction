import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pradkumar\\\\Downloads\\\\Selenium+java\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ekwm-dev1.login.us6.oraclecloud.com");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// For Maximize view of browser window
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		// For login 
		driver.findElement(By.cssSelector("#userid")).sendKeys("mjaime");
		driver.findElement(By.cssSelector("#password")).sendKeys("Welcome123");
		driver.findElement(By.cssSelector("#btnActive")).click();
		
		
		
		driver.findElement(By.xpath("//a[.='Navigator']")).click();
		driver.findElement(By.xpath("//a[.='Show More']")).click();
		driver.findElement(By.xpath("//span[.='Payments']")).click();
		driver.findElement(By.xpath("//img[@class='x1gd']")).click();
		driver.findElement(By.xpath("//a[.='Create Payment']")).click();
		driver.findElement(By.xpath("//a[@title='Search: Business Unit']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'IT Convergence India - Hyderabad')]")).click();
		driver.findElement(By.xpath("//a[@title='Search: Supplier or Party']")).click();
		driver.findElement(By.xpath("//input[@aria-label=' Party Name']")).sendKeys("IT");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'IT Monteur')]")).click();
		driver.findElement(By.xpath("//button[contains(@id,'lovDialogId::ok')]")).click();
		driver.findElement(By.xpath("//a[@title='Select Date']")).click();
		driver.findElement(By.xpath("//select[@title='April']/option[4]")).click();
		driver.findElement(By.xpath("//table[@summary='April 2023']/tbody/tr[3]/td[3]")).click();
		driver.findElement(By.xpath("//select[@title='Quick']")).click();
		driver.findElement(By.xpath("//a[@title='Search: Disbursement Bank Account']")).click();
		driver.findElement(By.xpath("//span[.='HDFC Current CS']")).click();
		driver.findElement(By.xpath("//label[.='Description']/../../td[2]/textarea")).sendKeys("Please, give your valuable feedback !! Thankyou ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Search: Payment Process Profile']/..")).click();
		driver.findElement(By.xpath("//span[text()='ISO20022 CGI PAIN.001.001.03']")).click();
		
		
		Thread.sleep(20000); // For just use to wait to see that all details are correctly filled or not
		driver.close();

	}
}
