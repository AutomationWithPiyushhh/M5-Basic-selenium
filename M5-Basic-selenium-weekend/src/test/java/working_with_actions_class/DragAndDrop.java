package working_with_actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frameWE = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameWE);

		Actions act = new Actions(driver);
		WebElement pic1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement pic2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement pic3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement pic4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		WebElement trash = driver.findElement(By.id("trash"));

		act.dragAndDrop(pic1, trash).perform();
		Thread.sleep(1000);

		act.dragAndDrop(pic2, trash).perform();
		Thread.sleep(1000);
		act.dragAndDrop(pic3, trash).perform();
		Thread.sleep(1000);
		act.dragAndDrop(pic4, trash).perform();

//		act.dragAndDropBy(pic2, 500,100).perform();
//		Thread.sleep(1000);		
//		act.dragAndDropBy(pic3, 500,100).perform();
//		Thread.sleep(1000);
//		act.dragAndDropBy(pic4, 500,100).perform();

		Thread.sleep(5000);
		driver.quit();
	}
}
