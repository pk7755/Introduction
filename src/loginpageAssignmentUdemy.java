import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpageAssignmentUdemy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.cssSelector("span.checkmark")).click();
		WebElement ele = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		Select dropdown = new Select(ele);
		dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));
		List<WebElement> elements = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		for(WebElement x:elements) {
			x.click();
		}
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='nav-link btn btn-primary'")));
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary'")).click();

	}

}
