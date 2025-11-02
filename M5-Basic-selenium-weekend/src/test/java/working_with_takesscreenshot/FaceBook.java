package working_with_takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBook {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
//		explicit typecast = downcast
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		File source = tks.getScreenshotAs(OutputType.FILE);
		
		
		File destination = new File("./errorShots/ss2.png");
//									. => 		=> project level
//									/errorShots => folder name
//									/ss1.png    => file name
		
		FileHandler.copy(source, destination);
		
		Thread.sleep(3000);
		driver.quit();
	}
//	source me kya tha 
}
