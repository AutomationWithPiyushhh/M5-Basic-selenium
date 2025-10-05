package working_with_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		Select selDay = new Select(dayDD);
		selDay.selectByIndex(0);
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select selMon = new Select(monthDD);
		selMon.selectByValue("2");
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select selYear = new Select(yearDD);
		selYear.selectByVisibleText("2020");
		
		
		
		
		List<WebElement> years = selYear.getOptions();
		for (WebElement i : years) {
			System.out.println(i.getText());
			Thread.sleep(100);
		}
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
