
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class LinkandList {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pradkumar\\Downloads\\Selenium+java\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ekwm-dev1.login.us6.oraclecloud.com");
		driver.manage().window().maximize();
		System.out.println("Title is: " +driver.getTitle());
		System.out.println("URL: " +driver.getCurrentUrl());
		
		//driver.switchTo().frame(driver.findElement(By.id("Example")).click());
		
		driver.findElement(By.cssSelector("#userid")).sendKeys("mjaime");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//button[contains(@class,'btnActiveChooser')]")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Home']")).click();
		driver.findElement(By.cssSelector("a#groupNode_payables")).click();
		driver.findElement(By.xpath("//a[.='Invoices']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("img[title='Tasks']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create Invoice\"]")).click();                         
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[.='Business Unit']/../..//input")).sendKeys("IT Convergence Brazil");
		driver.findElement(By.xpath("//label[.='Type']/../..//select/option[4]")).click();
		
		
		//Function to sort and print list elements:  
		
		WebElement element = driver.findElement(By.xpath("//label[.='Type']/../..//select"));
		Select se = new Select(element);
		ArrayList<String> originalList = new ArrayList<String>();
		 for (WebElement e : se.getOptions()) {
		  originalList.add(e.getText());
		 }
		 ArrayList<String> tempList = originalList;
		 System.out.println(tempList);
		 Collections.sort(tempList); 
		 System.out.println(tempList);
		 
	}

}