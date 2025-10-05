package working_with_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		
		driver.switchTo().frame(0);
		System.out.println("i am in frame and can just see few things....");
		
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.className("entry-title")).getText();
		System.out.println(text);
		
	
		driver.quit();
	}
}
