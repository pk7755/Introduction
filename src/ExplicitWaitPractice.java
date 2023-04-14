import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitPractice {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradkumar\\Downloads\\Selenium+java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		String[] itemNeeded = {"cucumber","brocolli","beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
	}

}
