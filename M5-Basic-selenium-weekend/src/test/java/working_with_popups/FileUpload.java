package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.className("main-3")).click();
		
		new Actions(driver).scrollByAmount(0, 2000).build().perform();
		
		WebElement resumeUpload = driver.findElement(By.id("resumeUpload"));
		resumeUpload.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Jenkins.pdf");
		
		Thread.sleep(3000);
//		driver.quit();
	}
}
