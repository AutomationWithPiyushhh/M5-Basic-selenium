package working_with_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookMetapay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		
		

		driver.findElement(By.linkText("Meta Pay")).click();

		
		Set<String> IDs = driver.getWindowHandles();
		System.out.println("size before removing pid : " + IDs.size());
		IDs.remove(parentID);
		System.out.println("size after removing pid : " + IDs.size());
		
		for (String i : IDs) {
//			System.out.println(i);
			driver.switchTo().window(i);
		}
		
		driver.findElement(By.linkText("Check availability")).click();
		
		Thread.sleep(5000);
//		driver.quit();
	}
}
