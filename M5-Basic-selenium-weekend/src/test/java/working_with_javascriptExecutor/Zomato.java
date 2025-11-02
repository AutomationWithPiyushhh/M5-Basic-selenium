package working_with_javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String url1 = "https://facebook.com/";
		String url2 = "https://zomato.com/";
		String url3 = "https://amazon.com/";
		String url4 = "https://flipkart.com/";
		String url5 = "https://swiggy.com/";

//		jse.executeScript("window.location='https://facebook.com/';");
//		jse.executeScript("window.location='" +  url + "';");
//		jse.executeScript("window.location=arguments[0];",url1);

		jse.executeScript("window.location=arguments[1];", url1, url2, url3, url4, url5);

//		Actions act = new Actions(driver);
//		act.scrollByAmount(0, 100).build().perform();
		WebElement checkItOut = driver.findElement(By.xpath("(//div[text()='Check it out'])[2]"));
//		act.scrollToElement(checkItOut).build().perform();

//		Thread.sleep(300);
//		jse.executeScript("window.scrollTo(0,100);");
//
//		Thread.sleep(300);
//		jse.executeScript("window.scrollBy(0,100);");

		jse.executeScript("arguments[0].scrollIntoView(true);", checkItOut);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView(false);", checkItOut);

		System.out.println(jse.executeScript("return document.title;"));

		Thread.sleep(3000);
		driver.quit();
	}
}
