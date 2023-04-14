import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradkumar\\Downloads\\Selenium+java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Pradyumna Kumar");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("pk9887@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pk9887@gm");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select gender = new Select(ele);
		gender.selectByIndex(0);
		driver.findElement(By.cssSelector("input[value='option2']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("01/10/2000");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		// Screenshot 
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\pradkumar\\Downloads\\Selenium+java\\Screenshots\\screenshot1.jpg"));
		
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText()); 
	}
}
