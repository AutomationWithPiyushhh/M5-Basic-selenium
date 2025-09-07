package initial_codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstLine {
	public static void main(String[] args) {
//		ChromeDriver driver1 = new ChromeDriver();
//		EdgeDriver driver2 = new EdgeDriver();
//		FirefoxDriver driver3 = new FirefoxDriver();

//		After upcasting
//		RemoteWebDriver driver1 = new ChromeDriver();
//		RemoteWebDriver driver2 = new EdgeDriver();
//		RemoteWebDriver driver3 = new FirefoxDriver();

//		Re-Initialization (Runtime Polymorphism)
//		RemoteWebDriver driver = new ChromeDriver();
//						driver = new EdgeDriver();
//						driver = new FirefoxDriver();

//		Because RemoteWebDriver was having 36 methods implementation
		WebDriver driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver = new FirefoxDriver();

//		-> load and re-initialize non static members
//		-> Start the server
//		-> Launch the empty chrome browser

	}
}
