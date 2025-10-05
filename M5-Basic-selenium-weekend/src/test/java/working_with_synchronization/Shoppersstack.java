package working_with_synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://shoppersstack.com/products_page/34");

		Thread.sleep(30000);
		driver.findElement(By.id("Check Delivery")).sendKeys("201301");
		WebElement checkBtn = driver.findElement(By.id("Check"));

//		Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));		
//		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));

//		Fluent Wait
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(250));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		wait.ignoring(NoSuchElementException.class);

		checkBtn.click();
	}
}  
