package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2Test {
	@Test
	public void case2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Demo2Test");
		Thread.sleep(10000);
		driver.quit();
	}
}
