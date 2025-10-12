package working_with_actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");

		driver.findElement(By.id("password")).sendKeys("qwertyu");

		Actions act = new Actions(driver);

		WebElement eye = driver.findElement(By.cssSelector("img[src='assets/img/Revamp/icon_eye_close.svg']"));

		act.clickAndHold(eye).perform();

		Thread.sleep(3000);
		act.release().perform();

		Thread.sleep(5000);
		driver.quit();
	}
}
