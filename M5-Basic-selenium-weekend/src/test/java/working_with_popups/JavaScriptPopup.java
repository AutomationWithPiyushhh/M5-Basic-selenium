package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://demowebshop.tricentis.com/");
//
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
//
//		Thread.sleep(1000);
//
//		Alert ale = driver.switchTo().alert();
//		ale.accept();
//
////		driver.switchTo().alert().accept();
//
////		ale.dismiss();
////		ale.sendKeys("abcd");
////		ale.getText();
//
////		After sel - 4 we got a new method of newWindow()
//		driver.switchTo().newWindow(WindowType.TAB);
//
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//
//		driver.findElement(By.name("submit")).click();
//
//		String text = ale.getText();
//		System.out.println("first popuup text : " + text);
//
//		Thread.sleep(2000);
////		ale.dismiss();
//		ale.accept();
//
//		Thread.sleep(2000);
//
//		System.out.println("second popup text : " + ale.getText());
//		ale.accept();
//
//		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.tagName("button")).click();
		
		Alert ale2 = driver.switchTo().alert();
		System.out.println("Prompt popup text is : " + ale2.getText());
		ale2.sendKeys("Dinga");
		ale2.accept();
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
