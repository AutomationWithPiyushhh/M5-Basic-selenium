package working_with_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();

		Thread.sleep(3000);
		driver.quit();
	}
}
