import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownsPractise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pradkumar\\\\Downloads\\\\Selenium+java\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Auto Suggestion list
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
			
		}
		//Journey type
		
		driver.findElement(By.cssSelector("input[value='OneWay']")).click();
		
//		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();

		
		// Journey Details
		driver.findElement(By.xpath("//input[contains(@id,'originStation1_CTXT')]")).click();
		// From
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		// TO
		driver.findElement(By.xpath("//div[contains(@id,'destinationStation1_CTNR')]//a[@value='VNS']")).click();
		
		//Depart Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		

		//Passengers
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(), "1 Adult");
		
		driver.findElement(By.id("divpaxinfo")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult");
		
		//Currency
		WebElement ele= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticDropdown=new Select(ele);
		staticDropdown.selectByIndex(1);
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		staticDropdown.selectByValue("AED");
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		staticDropdown.selectByVisibleText("USD");
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		
		//Check-box
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(),"Pass");
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(),"Pass");
		
		
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		
		// validation of calendar whether is it Enable or Disable. On the basis of journey type
//		System.out.println(driver.findElement(By.cssSelector("input[id*='mainContent_view_date2']")).isEnabled()); // this will not work in that situation
//		driver.findElement(By.cssSelector("input[id*='mainContent_view_date2']")).getAttribute("Style");
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("RoundTrip calander is Enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("RoundTrip calander is Disabled");
			Assert.assertTrue(false);
		}
		
		
		
	}

}
