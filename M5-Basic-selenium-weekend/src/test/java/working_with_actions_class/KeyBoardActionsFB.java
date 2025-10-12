package working_with_actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsFB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement pwd = driver.findElement(By.id("passContainer"));

		Actions act = new Actions(driver);

		act.sendKeys("admin").perform();

		Thread.sleep(1000);

		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();

		Thread.sleep(1000);

		act.sendKeys("qwertyuiyhgfdfg").perform();
//		act.sendKeys(pwd, "admin").perform();

		Thread.sleep(1000);

		act.keyDown(Keys.ENTER).perform();
		act.keyUp(Keys.ENTER).perform();

		Thread.sleep(5000);
		driver.quit();
	}
}
