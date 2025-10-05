package working_with_actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement link = driver.findElement(By.partialLinkText("Forgotten"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
//		act.moveToElement(link).perform();
		
//		Thread.sleep(2000);
//		act.click().perform();
		
		act.contextClick(link).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
