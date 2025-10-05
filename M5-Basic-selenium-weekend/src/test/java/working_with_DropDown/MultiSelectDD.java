package working_with_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

//		Switch to frame
//		driver.switchTo().frame(1);		
//		driver.switchTo().frame("iframeResult");
		
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));		
		driver.switchTo().frame(frameEle);
		
		WebElement carDD = driver.findElement(By.id("cars"));

		Select selCar = new Select(carDD);
		

//		Ṣelection
		selCar.selectByIndex(0);
		selCar.selectByIndex(2);

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		
		Thread.sleep(2000);
		driver.quit();
	}
}
