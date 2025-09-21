package working_with_webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();

//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.manage().window().minimize();
//		Thread.sleep(1000);
//		driver.manage().window().fullscreen();

		driver.get("https://www.instagram.com/");

//		getSize()
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);

		int w = dim.getWidth();
		int h = dim.getHeight();

		System.out.println("width is : " + w);
		System.out.println("height is : " + h);

//		setSize()
		Dimension dim2 = new Dimension(525, 350);
		driver.manage().window().setSize(dim2);

//		getPosition()
		Point pt1 = driver.manage().window().getPosition();
		System.out.println(pt1);
		
		int x = pt1.getX();
		int y = pt1.getY();
		
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		
//		setPosition()
		Point pt2 = new Point(-100, 4);
		driver.manage().window().setPosition(pt2);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
