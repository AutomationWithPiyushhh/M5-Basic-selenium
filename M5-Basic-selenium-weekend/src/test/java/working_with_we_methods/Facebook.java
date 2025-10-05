package working_with_we_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://www.facebook.com/");
//		
//		WebElement un = driver.findElement(By.id("email"));
//		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
//		
//		
//		un.sendKeys("admin");
//		Thread.sleep(1000);
//		un.clear();
//		Thread.sleep(1000);
//		un.sendKeys("76543209833");
//		
//		loginBtn.submit();
//		
//		driver.navigate().back();

//		driver.findElement(By.linkText("Create new account")).click();

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/input"));

//		if (maleRadio.isDisplayed() && maleRadio.isEnabled()) {
//			if (!maleRadio.isSelected()) {
//				maleRadio.click();
//			}
//		}

		System.out.println(maleRadio.getAttribute("aria-describedby"));
		System.out.println(maleRadio.getCssValue("height"));

	}
}
