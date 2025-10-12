package working_with_takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBookWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@id,\"u_0_5\")]"));
		
		File src = loginBtn.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/webele.png");
		
		FileHandler.copy(src, dest);
		
		driver.quit();
		
	}
}
