import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pradkumar\\\\Downloads\\\\Selenium+java\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("****************************************************************************************************************");
		for (int i = 1; i < 30; i++) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("The Current URL of the website is : "+url);
		System.out.println("The title of the website is : "+title);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.cssSelector(".signInBtn")).click();
		Thread.sleep(2000);
		String op=driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
		System.out.println(op);
		driver.findElement(By.cssSelector(".logout-btn")).click();
		System.out.println("Logout successfully !!");
		System.out.println("Test Case "+i+" Passed Successfully.");
		System.out.println("****************************************************************************************************************");
		
		}	
	}
}
