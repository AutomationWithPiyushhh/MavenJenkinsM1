package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1Test {
	@Test
	public void case1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Demo1Test");
		Thread.sleep(3000);
		driver.quit();
	}
}
