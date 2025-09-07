package working_with_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		driver.quit();

		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		
	
		Thread.sleep(3000);
		driver.quit();
//		driver.quit();
		driver.quit();
	}
}
