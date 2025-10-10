package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3Test {
	@Test
	public void case3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Demo3Test");
		Thread.sleep(10000);
		driver.quit();
	}
}
