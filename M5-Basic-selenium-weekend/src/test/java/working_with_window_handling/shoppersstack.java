package working_with_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		driver.get("https://www.shoppersstack.com/products_page/24");
	
		Thread.sleep(50000);
		
//		step 1 > get the home address
		String pid = driver.getWindowHandle();
		
//		step 2 > perform the task which opens new windows
		driver.findElement(By.id("compare")).click();
		
//		step 3 > get all the window session IDs
		Set<String> IDs = driver.getWindowHandles();
		
//		Step 4 > switch to every window and check which window contains 
//				 your desired title or URL, 
//				 break the loop and  perform the task
		for (String i : IDs) {
			driver.switchTo().window(i);
			if (driver.getTitle().contains("Amazon")) {
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
//		step 5 > come back home
		driver.switchTo().window(pid);
		driver.quit();
	}
}
