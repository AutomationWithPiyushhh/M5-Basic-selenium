package working_with_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Navigation nav = driver.navigate();
		 
		Thread.sleep(2000);
		nav.back();
		
		Thread.sleep(2000);
		nav.forward();
		
		Thread.sleep(2000);
		nav.refresh();
		
		Thread.sleep(2000);
		nav.to("https://www.instagram.com/");
//		nav.to(new URL("https://www.instagram.com/"));
		
//		Differences between get() and navigate()
	}
}
