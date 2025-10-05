package working_with_actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://jqueryui.com/slider/");
//
//		WebElement frameEle = driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(frameEle);
//
//		WebElement slider = driver.findElement(By.id("slider"));
//
		Actions act = new Actions(driver);
////		act.moveToElement(slider).moveByOffset(0, 0).click().build().perform();
//		act.moveToElement(slider, 0, 0).click().build().perform();
//		Thread.sleep(2000);
//
////		act.moveToElement(slider).moveByOffset(100, 0).click().build().perform();
//		act.moveToElement(slider, 100, 0).click().build().perform();
//		Thread.sleep(500);
//
////		act.moveToElement(slider).moveByOffset(50, 0).click().build().perform();
//		act.moveToElement(slider, 50, 0).click().build().perform();
//		Thread.sleep(500);
//
////		act.moveToElement(slider).moveByOffset(0, 0).click().build().perform();
//		act.moveToElement(slider, 0, 0).click().build().perform();
//		Thread.sleep(1000);

		
		driver.get("https://demo.automationtesting.in/Slider.html");
		
		WebElement slider1 =  driver.findElement(By.className("ui-slider-handle"));
//		act.moveToElement(slider1,100,0).build().perform();
		act.dragAndDropBy(slider1, 50, 0).build().perform();
		Thread.sleep(100);
		act.dragAndDropBy(slider1, 50, 0).build().perform();
		Thread.sleep(100);
		act.dragAndDropBy(slider1, 50, 0).build().perform();
		Thread.sleep(100);
		act.dragAndDropBy(slider1, 50, 0).build().perform();
		Thread.sleep(100);
		act.dragAndDropBy(slider1, 50, 0).build().perform();
		Thread.sleep(100);
		act.dragAndDropBy(slider1, 50, 0).build().perform();
		
		Thread.sleep(3000);
		
		
		
		
		driver.quit();
	}
}
