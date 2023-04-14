
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// Invoking browser
		// Chrome --> ChromeDriver --> Methods close get
		//Firefox firefoxDriver --> methods close get
		//safari safariDriver --> methods close get
		//Create object of the class to access the method present in the class
		
		//Chrome
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\pradkumar\\Downloads\\Selenium+java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Firefox
		System.setProperty("WebDriver.gecko.driver","C:\\Users\\pradkumar\\Downloads\\Selenium+java\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		
		//Edge
		System.setProperty("WebDriver.edge.driver","C:\\Users\\pradkumar\\Downloads\\Selenium+java\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver2.get("https://rahulshettyacademy.com/");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		
		driver3.get("https://rahulshettyacademy.com/");
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		
	}
}
 