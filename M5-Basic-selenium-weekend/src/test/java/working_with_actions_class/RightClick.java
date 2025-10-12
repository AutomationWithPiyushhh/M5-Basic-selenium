package working_with_actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement rc = driver.findElement(By.id("rightclick"));
		
		Actions act = new Actions(driver);
//		act.moveToElement(rc).contextClick().build().perform();
		
		
		
		Thread.sleep(5000);
		driver.quit();	
	}
}
