package working_with_searchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFindElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement username = driver.findElement(By.id("email"));

		WebElement username = driver.findElement(By.xpath("//input[@data-testid='royal-email']"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		
		Thread.sleep(1000);
		
//		click on Create a page 
//		WebElement cap = driver.findElement(By.xpath("//a[text()='Create a Page']"));
//		cap.click();
		
//		click on Login button 
//		driver.findElement(By.cssSelector("div>button")).click();
		
//		WebElement forgotPwd = driver.findElement(By.linkText("Forgotten password?"));
//		WebElement forgotPwd = driver.findElement(By.partialLinkText("F"));
//		forgotPwd.click();
		
//		WebElement plus= driver.findElement(By.className("_517i"));
//		plus.click();
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}
}
