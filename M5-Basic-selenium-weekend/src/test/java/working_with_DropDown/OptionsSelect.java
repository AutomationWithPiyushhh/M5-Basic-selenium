package working_with_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("C:/Users/User/git/M5-basic-weekend/M5-Basic-selenium-weekend/src/test/java/html/options.html");

//		Step 1 : get the dropdown webelement
		WebElement optDD = driver.findElement(By.id("randomValues"));

//		Step 2 : create the object of Select class
		Select sel = new Select(optDD);

//		Step 3 : perform select class methods

//		Ṣelection
		sel.selectByIndex(1);
		Thread.sleep(1000);

		sel.selectByIndex(3);
		Thread.sleep(1000);

		sel.selectByIndex(0);
		Thread.sleep(1000);

//		String first = sel.getFirstSelectedOption().getText();
//		System.out.println(first);

		List<WebElement> selectedList = sel.getAllSelectedOptions();
		for (WebElement i : selectedList) {
			String text = i.getText();
			System.out.println(text);
		}

		boolean status = sel.isMultiple();

//		Deselection
		if (status) {
//			sel.deselectByIndex(0);
//			Thread.sleep(1000);
//			
//			sel.deselectByValue("b");
//			Thread.sleep(1000);
//			
//			sel.deselectByVisibleText("@#$");
			sel.deselectAll();
		}

		Thread.sleep(1000);
		driver.quit();
	}
}
