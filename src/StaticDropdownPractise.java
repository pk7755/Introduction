import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdownPractise {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector(".css-1dbjc4n")).click();
		driver.findElement(By.cssSelector(".css-1dbjc4n")).click();
		for (int i = 0; i < 5; i++) {
			
		}
		
	}

}
