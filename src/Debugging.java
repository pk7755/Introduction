import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugging {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradkumar\\Downloads\\Selenium+java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\facebook.com");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("Pradyumna");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		getScreenshot(driver);
		driver.quit();
	}
	public static void getScreenshot(WebDriver driver) throws IOException {
		driver.get("https:\\google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\pradkumar\\Downloads\\Selenium+java\\Screenshots\\pk1.png"));
		
	}
	
	

}
