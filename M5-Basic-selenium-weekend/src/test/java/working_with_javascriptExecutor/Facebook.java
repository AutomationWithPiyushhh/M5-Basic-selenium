package working_with_javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
//		WebElement username = driver.findElement(By.id("email"));
//		WebElement loginBtn = driver.findElement(By.name("login"));
				
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
//							 username.sendKeys("admin");
//		jse.executeScript("arguments[0].value='admin';", username);
//		
////							   loginBtn.click();
//		jse.executeScript("arguments[0].click();", loginBtn);
		
		WebElement custom = driver.findElement(By.id("custom_gender"));
//		custom.sendKeys("male");
		
		jse.executeScript("arguments[0].value='male'", custom);
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
