import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedListPractice {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\pradkumar\\Downloads\\Selenium+java\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		
		WebElement ele =driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']"));
		Select se = new Select(ele);
		ArrayList<String> originalList = new ArrayList<String>();
		for(WebElement e : se.getOptions()) {
			originalList.add(e.getText());
		}
		ArrayList<String> tempList = originalList;
		System.out.println(tempList);
		Collections.sort(tempList);
		System.out.println(tempList);
		
	}

}
