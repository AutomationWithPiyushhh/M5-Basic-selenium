package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		ChromeOptions setting2 = new ChromeOptions();
		setting2.addArguments("--incognito");
		
		ChromeOptions setting3 = new ChromeOptions();
		setting3.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(setting);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");
		
		
		
		
		Thread.sleep(5000);
//		driver.quit();
	}
}
